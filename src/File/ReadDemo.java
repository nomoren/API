package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�����
 * @author admin
 *
 */
public class ReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("fox.txt", "r");
		/*
		 * int read()
		 * ��ȡһ���ֽڣ�����int��ʽ����
		 * ������ֵΪ-1�����ʾ�������ļ�ĩβ
		 * 00000000 00000000 00000000 00000001
		 */
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
