package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �ļ����Ʋ���
 * @author admin
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * ��������raf��һ��������Դ�ļ���
		 * һ�������������ļ���д
		 * ˳���Դ�ļ���ȡÿ���ֽ�д�뵽�����ļ���
		 */
		RandomAccessFile src=new RandomAccessFile("image.jpg","r");
		RandomAccessFile desc=new RandomAccessFile("image1.jpg","rw");
		int d=-1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("ok");
	}
}
