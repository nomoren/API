package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一对高级流，功能是提高读写效率。链接它们以后，无论
 * 我们进行随机读写还是块读写，当经过缓冲流时都会被转换为块读写操作
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * @author admin
 *
 */

public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fox.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("fox1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int len=-1;
		long s=System.currentTimeMillis();
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bos.close();
		bis.close();
		long e=System.currentTimeMillis();
		System.out.println(e-s);
	}
}
