package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *��ϣ����߶�дЧ�ʣ�����ͨ�����ÿ��ʵ�ʶ�д�����ݣ�����ʵ�ʷ����Ķ�д������ʵ��
 *���ֽڶ�д�������д
 *һ�����ݶ�д�����д
 *��еӲ�̵Ŀ��дЧ���ǱȽϺõģ����������дЧ�ʲ�
 * @author admin
 *
 */
public class Copy2 {
public static void main(String[] args) throws IOException {
	/*
	 * raf�ṩ���д�Ĳ�������
	 * int read(byte[] data) һ���Զ�ȡ�������ֽ����鳤�ȵ��ֽ��������뵽�������С�����ֵΪ
	 * ʵ�ʶ�ȡ�����ֽ�����������ֵΪ-1����ʾ���ζ�ȡ���ļ�ĩβ
	 * void write(byte[] data,int start,int len) һ���Ը��������д�start����ʼ������len���ֽ�
	 */
	RandomAccessFile src=new RandomAccessFile("mysql.msi", "r");
	RandomAccessFile dex=new RandomAccessFile("mysql2.msi", "rw");
	
	byte[] data=new byte[1024*10];
	int len=-1;
	long start=System.currentTimeMillis();
	while((len=src.read(data))!=-1){
		dex.write(data,0,len);
	}
	long end=System.currentTimeMillis();
	System.out.println(end-start);

	
}
}
