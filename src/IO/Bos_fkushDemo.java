package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * ��������write��������������������д���������Ƚ����ݴ�ȡ���ڲ������У�
 * ������װ��ʱ�Ż���һ����ʵд������ת��Ϊ��д�����Ĺ��̣�
 * @author admin
 *
 */
public class Bos_fkushDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("box.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String line="���Ǹ��ڵ�̫��";
		byte[] data=line.getBytes("utf-8");
		bos.write(data);
		//bos.flush();
		bos.close();
		/*
		 * flush������������ǿ�ƽ��Ѿ����������һ����д����������������д��������
		 * �м�ʱ�ԣ�����Ƶ�����ûή��ЩЧ�ʣ��ڸ���עд���ļ�ʱ��Ӧ��ʹ�ø÷���
		 */
	}
}
