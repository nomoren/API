package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class NoBlock {
	public static void main(String[] args) throws IOException {
		ServerSocketChannel ssChannel=ServerSocketChannel.open();
		ssChannel.configureBlocking(false);//切换为非阻塞模式
		ssChannel.bind(new InetSocketAddress(8889));
		
		//获取选择器
		Selector selector=Selector.open();
		//把通道注册到选择器，第二个参数表示通道和选着器的关系（读，写，连接和接收事件） 即指定监听事件
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		//轮询式的获取选择器上已经准备就绪的事件
		while(selector.select()>0) {//有准备就绪的事件吗,这里阻塞，一直到有就绪的事件
			Iterator<SelectionKey> it=selector.selectedKeys().iterator();//获取所有选择键，即已就绪的监听事件
			while(it.hasNext()) {
				SelectionKey key=it.next();//获取准备就绪的事件
				if(key.isAcceptable()) {//如果是接收事件：
					SocketChannel schannel=ssChannel.accept();
					schannel.configureBlocking(false);
					schannel.register(selector, SelectionKey.OP_READ);
				}else if(key.isConnectable()) {
					
				}else if(key.isReadable()) {//如果是读数据事件（即客户端有发数据过来，触发该事件），先获取seletor上读就绪的通道
					SocketChannel schannel=(SocketChannel) key.channel();
					schannel.configureBlocking(false);
					ByteBuffer buffer=ByteBuffer.allocate(1024);
					int len=0;
					while((len=schannel.read(buffer))>0) {
						buffer.flip();
						System.out.println(new String(buffer.array(),0,len));
						buffer.clear();
					}
				}else if(key.isWritable()) {
					
				}
			}
			it.remove();//删除it里面的所有选择键，不然当就绪事件处理完，下次it.hasNext()的时候，之间的key就还在
		}
	}
	

	@Test
	public void client() throws IOException, InterruptedException {
		SocketChannel sChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",8889));
		
		sChannel.configureBlocking(false);//切换为非阻塞模式
		
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		buffer.put(new Date().toString().getBytes());
		buffer.flip();
		sChannel.write(buffer);
		buffer.clear();
		sChannel.close();
		
	}
	@Test
	public void server() throws IOException {
		ServerSocketChannel ssChannel=ServerSocketChannel.open();
		ssChannel.configureBlocking(false);//切换为非阻塞模式
		ssChannel.bind(new InetSocketAddress(8889));
		
		//获取选择器
		Selector selector=Selector.open();
		//把通道注册到选择器，第二个参数表示通道和选着器的关系（读，写，连接和接收事件） 即指定监听事件
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		//轮询式的获取选择器上已经准备就绪的事件
		while(selector.select()>0) {//有准备就绪的事件吗
			Iterator<SelectionKey> it=selector.selectedKeys().iterator();//获取所有选择键，即已就绪的监听事件
			while(it.hasNext()) {
				SelectionKey key=it.next();//获取准备就绪的事件
				if(key.isAcceptable()) {//如果是接收事件：
					SocketChannel schannel=ssChannel.accept();
					schannel.configureBlocking(false);
					schannel.register(selector, SelectionKey.OP_READ);
				}else if(key.isConnectable()) {
					
				}else if(key.isReadable()) {//如果是读数据事件（即客户端有发数据过来，触发该事件），先获取seletor上读就绪的通道
					SocketChannel schannel=(SocketChannel) key.channel();
					ByteBuffer buffer=ByteBuffer.allocate(1024);
					int len=0;
					while((len=schannel.read(buffer))>0) {
						buffer.flip();
						System.out.println(new String(buffer.array(),0,len));
						buffer.clear();
					}
				}else if(key.isWritable()) {
					
				}
			}
			it.remove();//删除it里面的所有选择键，不然当就绪事件处理完，下次it.hasNext()的时候，之间的key就还在
		}
	}
}
