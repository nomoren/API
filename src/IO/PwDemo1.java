package IO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java.io.PrinWrite
 * �����Զ���ˢ�µĻ����ַ������
 * �����бȽϳ��õ��ַ��߼���
 * �ɰ���д���ַ���
 * @author admin
 *
 */
public class PwDemo1 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * pw�ṩ��ר�����д�ļ��Ĺ��췽��
		 * PrintWrite(String path)
		 * PrintWrite(File file)
		 */
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		//PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("���ݺ���");
		pw.print("Ʊ��");
		pw.close();
	}
}
