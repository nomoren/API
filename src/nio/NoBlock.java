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
		ssChannel.configureBlocking(false);//�л�Ϊ������ģʽ
		ssChannel.bind(new InetSocketAddress(8889));
		
		//��ȡѡ����
		Selector selector=Selector.open();
		//��ͨ��ע�ᵽѡ�������ڶ���������ʾͨ����ѡ�����Ĺ�ϵ������д�����Ӻͽ����¼��� ��ָ�������¼�
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		//��ѯʽ�Ļ�ȡѡ�������Ѿ�׼���������¼�
		while(selector.select()>0) {//��׼���������¼���,����������һֱ���о������¼�
			Iterator<SelectionKey> it=selector.selectedKeys().iterator();//��ȡ����ѡ��������Ѿ����ļ����¼�
			while(it.hasNext()) {
				SelectionKey key=it.next();//��ȡ׼���������¼�
				if(key.isAcceptable()) {//����ǽ����¼���
					SocketChannel schannel=ssChannel.accept();
					schannel.configureBlocking(false);
					schannel.register(selector, SelectionKey.OP_READ);
				}else if(key.isConnectable()) {
					
				}else if(key.isReadable()) {//����Ƕ������¼������ͻ����з����ݹ������������¼������Ȼ�ȡseletor�϶�������ͨ��
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
			it.remove();//ɾ��it���������ѡ�������Ȼ�������¼������꣬�´�it.hasNext()��ʱ��֮���key�ͻ���
		}
	}
	

	@Test
	public void client() throws IOException, InterruptedException {
		SocketChannel sChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",8889));
		
		sChannel.configureBlocking(false);//�л�Ϊ������ģʽ
		
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
		ssChannel.configureBlocking(false);//�л�Ϊ������ģʽ
		ssChannel.bind(new InetSocketAddress(8889));
		
		//��ȡѡ����
		Selector selector=Selector.open();
		//��ͨ��ע�ᵽѡ�������ڶ���������ʾͨ����ѡ�����Ĺ�ϵ������д�����Ӻͽ����¼��� ��ָ�������¼�
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		//��ѯʽ�Ļ�ȡѡ�������Ѿ�׼���������¼�
		while(selector.select()>0) {//��׼���������¼���
			Iterator<SelectionKey> it=selector.selectedKeys().iterator();//��ȡ����ѡ��������Ѿ����ļ����¼�
			while(it.hasNext()) {
				SelectionKey key=it.next();//��ȡ׼���������¼�
				if(key.isAcceptable()) {//����ǽ����¼���
					SocketChannel schannel=ssChannel.accept();
					schannel.configureBlocking(false);
					schannel.register(selector, SelectionKey.OP_READ);
				}else if(key.isConnectable()) {
					
				}else if(key.isReadable()) {//����Ƕ������¼������ͻ����з����ݹ������������¼������Ȼ�ȡseletor�϶�������ͨ��
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
			it.remove();//ɾ��it���������ѡ�������Ȼ�������¼������꣬�´�it.hasNext()��ʱ��֮���key�ͻ���
		}
	}
}
