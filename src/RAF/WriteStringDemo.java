package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * д���ַ�������
 * 
 * @author admin
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		//string �ṩ��ת��Ϊ2��ֹ�ķ���byte[] getBytes()
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		String line="��Һã�����������";
		byte[] data=line.getBytes("UTF-8");//ָ���ַ�������ת��
		raf.write(data);
		System.out.println("д�����");
	}
}
