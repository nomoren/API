package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�����ɸ����ļ�����
 * ʹ���ļ���������ȡԴ�ļ���ʹ���ļ�����������ļ�д����
 * 
 * ���ÿ��д����˳���Դ�ļ������ݶ�ȡ����д�븴���ļ�
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
