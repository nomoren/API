package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *若希望提高读写效率，可以通过提高每次实际读写的数据，减少实际发生的读写操作来实现
 *单字节读写：随机读写
 *一组数据读写：块读写
 *机械硬盘的快读写效率是比较好的，但是随机读写效率差
 * @author admin
 *
 */
public class Copy2 {
public static void main(String[] args) throws IOException {
	/*
	 * raf提供块读写的操作方法
	 * int read(byte[] data) 一次性读取给定的字节数组长度的字节量并存入到该数组中。返回值为
	 * 实际读取到的字节量，若返回值为-1，表示本次读取到文件末尾
	 * void write(byte[] data,int start,int len) 一次性给出数组中从start处开始的连续len个字节
	 */
	RandomAccessFile src=new RandomAccessFile("mysql.msi", "r");
	RandomAccessFile dex=new RandomAccessFile("mysql2.msi", "rw");
	
	byte[] data=new byte[1024*10];
	int len=-1;
	long start=System.currentTimeMillis();
	while((len=src.read(data))!=-1){
		dex.write(data,0,len);
	}
	long end=System.currentTimeMillis();
	System.out.println(end-start);

	
}
}
