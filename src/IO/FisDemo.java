package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ʹ���ļ���������ȡ�ļ�����
 * @author admin
 *
 */
public class FisDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fos=new FileInputStream("fox.txt");
		byte[] data=new byte[200];
		int len =fos.read(data);
		/*System.out.println(data.length);
		System.out.println(len);*/
		String str=new String(data,0,len,"utf-8");
		System.out.println(str);
	}
}
