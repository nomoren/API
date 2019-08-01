package IO;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author admin
 *
 */
/*当在流链接中创建Printgwrite时，允许指定第二个参数，
 * 该参数为一个boolean值，当这个值为true时，当前pw具有行刷新功能
 * 即：每当调用println方法时，会自动flush
 * 注意：printf方法不会自动flush
 */
public class Text {
	public static void main(String[] args)  {
	ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		try (FileOutputStream fos=new FileOutputStream("fox,txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos, "gbk");
				BufferedWriter  bw=new BufferedWriter(osw);
				PrintWriter pw=new PrintWriter(bw,true))
		{
			System.out.println("输入内容");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
