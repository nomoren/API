package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ת����
 * java.io.inputstreamreaders
 * @author admin
 *
 */
public class IsrDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fox.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		/*�ַ����ķ���
		 * int read����
		 * �÷�����һ�ζ�ȡһ���ַ���ʵ�ʶ�ȡ���ֽ���Ҫ����ָ�����ַ�������
		 * ���Ƕ�ȡ�����ַ�����java�ж�����һ��char��ʽ����
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
