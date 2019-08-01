package IO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrinWrite
 * 具有自动行刷新的缓冲字符输出流
 * 开发中比较常用的字符高级流
 * 可按行写出字符串
 * @author admin
 *
 */
public class PwDemo1 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * pw提供了专门针对写文件的构造方法
		 * PrintWrite(String path)
		 * PrintWrite(File file)
		 */
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		//PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("海草海草");
		pw.print("票啊");
		pw.close();
	}
}
