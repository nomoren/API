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
 *���±����ܣ�����Ҫ���û�����һ���ļ������������ļ�����������
 * Ȼ��ͨ������̨�����ÿһ���ַ���������д�뵽���ļ��У���
 * ʹ��GBK���뱣�档��������ַ���Ϊ"exit"ʱ�˳�����
 * @author admin
 *
 */
/*�����������д���Printgwriteʱ������ָ���ڶ���������
 * �ò���Ϊһ��booleanֵ�������ֵΪtrueʱ����ǰpw������ˢ�¹���
 * ����ÿ������println����ʱ�����Զ�flush
 * ע�⣺printf���������Զ�flush
 */
public class Text {
	public static void main(String[] args)  {
	ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		try (FileOutputStream fos=new FileOutputStream("fox,txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos, "gbk");
				BufferedWriter  bw=new BufferedWriter(osw);
				PrintWriter pw=new PrintWriter(bw,true))
		{
			System.out.println("��������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
