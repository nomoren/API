package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位又进行了一种划分方式
 * 字节流和字符流
 * 字节流的读写单位是字节，而字符流的读写单位是字符
 * 所以字符流适合读写文本数据
 * 
 * java.io.read  java.io.write
 * 这两个类也是抽象类，是所有字符输入流与字符输出流的父类，规定了读写的相关方法
 * 
 * 转换流
 * java.io.InputStreamRead
 * java.io.OutputStreamRead
 * 它们是一对常用的字符流是实现类，经常在我们做字符数据读写操作中使用
 * 并且在流链接中是非常重要的一个环节，但是我们很少直接对他做操作
 * @author admin
 *
 */
public class OswDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		String line="摩擦摩擦，";
		osw.write(line);
		osw.close();
	}

}
