package nio;

import java.nio.ByteBuffer;

import org.junit.Test;

/**
 * buffer 在nio中负责存取数据，根据数据类型不同，有对应的buffer(charbuffer,intbuffer,bytebuffer...)
 * buffer的四个总要属性：
 *  mark = -1; 记录position的位置，可通过reset（）回到mark的位置，可以通过mark()标记position的位置
    position = 0;buffer中正在操做数据的位置
    limit 界限 表示buffer中可以操作数据的大小，limit后面的数据是不能读写的
    capacity 容量，表示buffer中最大容量
 * @author ME
 *
 */
public class Buffer {
	public static void main(String[] args) {
		ByteBuffer byteBuffer=ByteBuffer.allocate(1024);//分配一个1024字节的byteBuffer
		byteBuffer.put("abc".getBytes());//put 存入数据到buffer中，此时position为3，limit为1024
		byteBuffer.flip();//切换为读数据模式，此时position为0，limit为3（因为此时buffer中只有‘abc’,可操作范围为所以为3）
		byte[] b=new byte[byteBuffer.limit()];
		byteBuffer.get(b);//position 3，limit 3 
		System.out.println(new String(b));
		byteBuffer.rewind();//重复读  position回到0,重复度
		byteBuffer.clear();//清空buffer，但数据依然在，数据处于被遗忘状态
	}
	@Test
	public void text() {
		ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
		byteBuffer.put("abcde".getBytes());
		byteBuffer.flip();
		byte[] b=new byte[byteBuffer.limit()];
		byteBuffer.get(b,0,2);
		System.out.println(new String(b));
		byteBuffer.mark();//标记此时position的位置，2
		byteBuffer.get(b,2,2);//此时破position 4
		System.out.println(new String(b,2,2));
		byteBuffer.reset();//回到market位置，2
		
		if(byteBuffer.hasRemaining()) {//buffer中是否还有可操作数据
			System.out.println(byteBuffer.remaining());//还有多少
		}
	}
	
	@Test
	public void text1() {
		//直接缓存区：通过allocate() 方法，把buffer建立在jvm中
		//非直接缓冲区，通过 allocateDirect()方法，把buffer建立在操作系统的物理内存中，可以提高效率
	}
	
	
	
	}
