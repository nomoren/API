package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java�������ն�д��λ�ֽ�����һ�ֻ��ַ�ʽ
 * �ֽ������ַ���
 * �ֽ����Ķ�д��λ���ֽڣ����ַ����Ķ�д��λ���ַ�
 * �����ַ����ʺ϶�д�ı�����
 * 
 * java.io.read  java.io.write
 * ��������Ҳ�ǳ����࣬�������ַ����������ַ�������ĸ��࣬�涨�˶�д����ط���
 * 
 * ת����
 * java.io.InputStreamRead
 * java.io.OutputStreamRead
 * ������һ�Գ��õ��ַ�����ʵ���࣬�������������ַ����ݶ�д������ʹ��
 * ���������������Ƿǳ���Ҫ��һ�����ڣ��������Ǻ���ֱ�Ӷ���������
 * @author admin
 *
 */
public class OswDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		String line="Ħ��Ħ����";
		osw.write(line);
		osw.close();
	}

}
