package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * java.io.bufferreader
 * 特点：可以按行读取字符串
 * @author admin
 *
 */
public class BrDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/IO/BrDemo.java");
		InputStreamReader isr=new InputStreamReader(fis,"gbk");
		BufferedReader bw=new BufferedReader(isr);
		/*
		 * string readlin额（）
		 * 读取一行字符串，顺序独处若干字符，当读取到了换行符停止，并将换行符之前的字符
		 * 组成一个字符串返回，返回的字符串中是不含有最后的换行符的
		 * 若返回值为null，说明流读取到了末尾
		 */
		String n;
		while((n=bw.readLine())!=null){
			System.out.println(n);
		}
		bw.close();
	}
}
