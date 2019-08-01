package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件数据
 * @author admin
 *
 */
public class ReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("fox.txt", "r");
		/*
		 * int read()
		 * 读取一个字节，并以int形式返回
		 * 若返回值为-1，则表示读到了文件末尾
		 * 00000000 00000000 00000000 00000001
		 */
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
