package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 写出字符串操作
 * 
 * @author admin
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		//string 提供了转换为2禁止的方法byte[] getBytes()
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		String line="大家好，我是渣渣辉";
		byte[] data=line.getBytes("UTF-8");//指定字符集进行转换
		raf.write(data);
		System.out.println("写出完毕");
	}
}
