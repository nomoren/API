package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * raf读写基本类型数据，以及raf的指针操作
 * @author admin
 *
 */
public class RafDemo2 {
	//写入一个int最大值到文件中、
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		
		int max=Integer.MAX_VALUE;
		int n=11;
		long a=123l;
		long pos=raf.getFilePointer();
	/*	System.out.println(pos);
		raf.write(max>>>24);
		System.out.println(raf.getFilePointer());
		raf.write(max>>>16);
		System.out.println(raf.getFilePointer());
		raf.write(max>>>8);
		System.out.println(raf.getFilePointer());
		raf.write(max);
		System.out.println(raf.getFilePointer());*/
		raf.writeInt(max);
		raf.writeLong(a);
		raf.writeInt(n);
		
		System.out.println(raf.getFilePointer());//写完后指正在文件末尾
		raf.seek(0);
		int d=raf.readInt();
		System.out.println(d);
		raf.seek(8);
		System.out.println(raf.getFilePointer());
		long f=raf.readLong();
		System.out.println(f);
	}
}
