package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Text {
	public static void main(String[] args) throws IOException {
		System.out.println("�����ļ���");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		RandomAccessFile raf=new RandomAccessFile(str, "rw");
		String ss=null;
		while(true){
		System.out.println("��������");
		ss=sc.nextLine();
			if("exit".equals(ss)) {
			System.out.println("�˳�");
			break;
		}
		byte[] data=ss.getBytes("UTF-8");
		raf.write(data);
		System.out.println("д�����");
		}
		raf.close();
		
		
	}
}
