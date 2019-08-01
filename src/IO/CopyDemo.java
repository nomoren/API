package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成复制文件操作
 * 使用文件输入流读取源文件，使用文件输出流向复制文件写数据
 * 
 * 利用块读写操作顺序从源文件将数据读取出来写入复制文件
 * @author admin
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fox1.txt");
		FileInputStream fis=new FileInputStream("fox.txt");
		byte[] data=new byte[100];
		int len=-1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		fis.close();
		fos.close();
		
		
	}
}
