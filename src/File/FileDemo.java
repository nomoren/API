package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * java.io.file
 * File��ÿһ��ʵ����ʾӲ���ϵ�һ���ļ�����Ŀ¼
 * ʹ��File���ԣ�
 * 1.�������ʾ���ļ���Ŀ¼��������Ϣ�����֣���С������Ȩ�޵ȣ�
 * 2.�����ļ���Ŀ¼(������ɾ��)
 * 3.����Ŀ¼������ǲ��ܷ����ļ�����
 * @author admin
 *
 */
public class FileDemo{
	public static void main(String[] args)  {
		
/*
 * ���ʵ�ǰĿ¼�µ�text.txt�ļ���
 * ����filesʱ��ָ����·��ͨ��ʹ����Ե�·�������·��������Ҫ����������л���ָ����λ��
 * ��elipse������Java����ʱ��ָ�������·����"��ǰ·�����ǵ�ǰ�������ڵ���ĿĿ¼���������
 * jsd1807_se���Ŀ¼
 * 
 */
	File file=new File("./a.txt");
	String name=file.getName();
	System.out.println(name);
	//��ȡ�ļ���С���ֽ�����
	long length=file.length();
	System.out.println(length);
	
	boolean cw=file.canWrite();
	boolean cr=file.canRead();
	boolean ih=file.isHidden();
	System.out.println(cw+"  "+cr +"  " + ih);
	
	
}
}
