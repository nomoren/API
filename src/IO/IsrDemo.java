package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 * java.io.inputstreamreaders
 * @author admin
 *
 */
public class IsrDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fox.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		/*字符流的方法
		 * int read（）
		 * 该方法是一次读取一个字符，实际读取的字节量要根据指定的字符集决定
		 * 但是读取到该字符后在java中都是以一个char形式保存
		 * int d=-1;
		 * */
		/*int d=-1;
		while((d=isr.read())!=-1){
			System.out.println(d);
			char c=(char)d;
			System.out.print(c);
		}*/
		char[] data=new char[5];
		int len=isr.read(data);
		System.out.println(len);
		String str=new String(data, 0, len);
		System.out.println(str);
		isr.close();
	}
}
