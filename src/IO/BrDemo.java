package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * java.io.bufferreader
 * �ص㣺���԰��ж�ȡ�ַ���
 * @author admin
 *
 */
public class BrDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/IO/BrDemo.java");
		InputStreamReader isr=new InputStreamReader(fis,"gbk");
		BufferedReader bw=new BufferedReader(isr);
		/*
		 * string readlin���
		 * ��ȡһ���ַ�����˳����������ַ�������ȡ���˻��з�ֹͣ���������з�֮ǰ���ַ�
		 * ���һ���ַ������أ����ص��ַ������ǲ��������Ļ��з���
		 * ������ֵΪnull��˵������ȡ����ĩβ
		 */
		String n;
		while((n=bw.readLine())!=null){
			System.out.println(n);
		}
		bw.close();
	}
}
