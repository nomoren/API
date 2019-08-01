package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class Block {
	//阻塞io
			//nio完成网络编程三个核心
			/**
			 * 1.channel
			 * 2.buffer
			 * 3.selector 选择器 是selectableChannel的多路复用器，用于监控通道
			 * @throws IOException 
			 */
public static void main(String[] args) throws IOException {
	SocketChannel sChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",8889));
	ByteBuffer buffer=ByteBuffer.allocate(1024);
	FileChannel inChannel=FileChannel.open(Paths.get("fox.txt"), StandardOpenOption.READ);
	while(inChannel.read(buffer)!=-1) {
		buffer.flip();
		sChannel.write(buffer);
		buffer.clear();
	}

	sChannel.shutdownInput();//告诉server数据发完了，不要再读了
	int len=-1;
	while((len=sChannel.read(buffer))!=-1) {//读不到数据会阻塞
		buffer.flip();
		System.out.println(new String(buffer.array(),0,len));
		buffer.clear();
	}
	inChannel.close();
}
	
	
	@Test
	public void client() throws IOException, InterruptedException {
		
	}
	@Test
	public void server() throws IOException {
		ServerSocketChannel ssChannel=ServerSocketChannel.open();
		ssChannel.bind(new InetSocketAddress(8889));
		
		SocketChannel sChannel=ssChannel.accept();//客户端还没连接，就在这里阻塞了，如果用非阻塞，让选择器监听sschannel的accept状态即可
		
		FileChannel outChannel=FileChannel.open(Paths.get("2.txt"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		while(sChannel.read(buffer)!=-1) {
			buffer.flip();
			outChannel.write(buffer);
			buffer.clear();
		}
		
		buffer.put("okokok".getBytes());
		buffer.flip();
		sChannel.write(buffer);
		System.out.println("xiechuok");
	}
	
}
