package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * raf��д�����������ݣ��Լ�raf��ָ�����
 * @author admin
 *
 */
public class RafDemo2 {
	//д��һ��int���ֵ���ļ��С�
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
		
		System.out.println(raf.getFilePointer());//д���ָ�����ļ�ĩβ
		raf.seek(0);
		int d=raf.readInt();
		System.out.println(d);
		raf.seek(8);
		System.out.println(raf.getFilePointer());
		long f=raf.readLong();
		System.out.println(f);
	}
}
