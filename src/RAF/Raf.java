package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io��randomAccessFile
 * raf��ר��������д�ļ����ݵ�api�������ָ����ļ����ݽ��ж�д�������������ı༭�ļ�
 * ���ݡ�����rafʱ����ָ���Ը��ļ���Ȩ�ޡ����õ�������
 * r:ֻ��ģʽ
 * rw��ֻдģʽ
 * @author admin
 *
 */
public class Raf {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		/**
		 * void writr��int d��
		 * ���ļ���д��1�ֽڣ�д���Ǹ���intֵ��Ӧ��2���Ƶĵ�8λ
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(2);
		raf.close();
	}
}
