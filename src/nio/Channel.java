package nio;
/**
 * channel 通道 负责程序和目标节点的连接，在nio中负责buffer的传输，本身不存取数据，配合buffer完成传输
 * fileChannel   socketChannel
 * 1.java对支持channel的类提供了getCannel方法：
 * inputSteram outPutStream randAccressFile  socket
 * 2.通过静态方法 open()
 * 3.通过files类的newByteChannel()
 * @author ME
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Channel {

	@Test
	public void text() throws IOException {
		FileInputStream in=new FileInputStream("fox.txt");
		FileOutputStream out=new FileOutputStream("raf.txt",true);
		FileChannel inChannel=in.getChannel();
		FileChannel outChannel=out.getChannel();
		ByteBuffer byteBuffer=ByteBuffer.allocate(9);
		//将通道中的数据读取到缓冲区中
		int i=0;
		while(inChannel.read(byteBuffer)!=-1) {
			System.out.println(i++);
			byteBuffer.flip();
			outChannel.write(byteBuffer);
			byteBuffer.clear();
		}
	}
	@Test
	public void text2() throws Exception {
		//直接缓冲区
		FileChannel inChannel=FileChannel.open(Paths.get("./fox.txt"), StandardOpenOption.READ);
		FileChannel outChannel=FileChannel.open(Paths.get("./fox2.txt"), StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
		
		MappedByteBuffer inMapperBuffer=inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());//内存映射文件 ,将文件映射到内存中来
		MappedByteBuffer outMapperBuffer=outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
	
		//直接对缓冲区操作,缓冲区会把内容写道磁盘当中
		byte[] b=new byte[inMapperBuffer.limit()];
		inMapperBuffer.get(b);
		outMapperBuffer.put(b);
	}
	
	@Test
	public void text3() throws IOException {
		//分散：把一个通道的数据分散到多个buffer中
		//聚集：把多个buffer中的数据聚集到一个通道中
		RandomAccessFile raf=new RandomAccessFile("fox.txt", "rw");
		FileChannel channel1=raf.getChannel();
		
		ByteBuffer buffer1=ByteBuffer.allocate(3);
		ByteBuffer buffer2=ByteBuffer.allocate(5);
		
		ByteBuffer[] buffers= {buffer1,buffer2};
		
		channel1.read(buffers);
		
		
		RandomAccessFile raf2=new RandomAccessFile("fox.txt", "rw");
		FileChannel channel2=raf2.getChannel();
		channel2.write(buffers);
	}
	
	@Test
	public void text4() throws CharacterCodingException {
		/*//字符集
		Map<String, Charset> map=Charset.availableCharsets();
		Set<Entry<String, Charset>> set=map.entrySet();
		for(Entry<String, Charset> e:set) {
			System.out.println(e.getKey()+":"+e.getValue());
		}*/
		
		Charset charset=Charset.forName("gbk");
		CharsetEncoder encoder=charset.newEncoder();
		CharsetDecoder decoder=charset.newDecoder();
		
		CharBuffer cb=CharBuffer.allocate(1024);
		cb.put("看到你");
		cb.flip();
		
		ByteBuffer buffer=encoder.encode(cb);
		buffer.flip();
		CharBuffer cb2=decoder.decode(buffer);
		cb2.flip();
		System.out.println("ww"+cb2.length());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
