package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����û�ע�Ṧ��
 * ����ʼ��Ҫ���û����룺�û��������룬�ǳƣ�����
 * ����¼д�뵽user.dat�С������û��������룬�ǳ�Ϊ�ַ���������Ϊһ��intֵ
 * ÿ����¼ռ100�ֽڣ����У��û��������룬�ǳƸ�ռ32�ֽڣ�����intռ4���ֽ�
 * @author admin
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭע��");
		System.out.println("�������û���");
		String username=sc.nextLine();
		System.out.println("����������");
		String password=sc.nextLine();
		System.out.println("�������ǳ�");
		String nickname=sc.nextLine();
		System.out.println("����������");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println(username+","+password+","+nickname+","+age);
		RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());//��ָ���Ƶ��ļ�ĩβ
		byte[] data=username.getBytes("UTF-8");//���û���ת��Ϊ��Ӧ��һ���ֽ�
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		data=password.getBytes("utf-8");
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		data=nickname.getBytes("utf-8");
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		raf.writeInt(age);
		System.out.println("ע�����");
		raf.close();
	}

}
