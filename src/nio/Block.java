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
	//����io
			//nio�����������������
			/**
			 * 1.channel
			 * 2.buffer
			 * 3.selector ѡ���� ��selectableChannel�Ķ�·�����������ڼ��ͨ��
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

	sChannel.shutdownInput();//����server���ݷ����ˣ���Ҫ�ٶ���
	int len=-1;
	while((len=sChannel.read(buffer))!=-1) {//���������ݻ�����
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
		
		SocketChannel sChannel=ssChannel.accept();//�ͻ��˻�û���ӣ��������������ˣ�����÷���������ѡ��������sschannel��accept״̬����
		
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
