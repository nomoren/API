package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 程序开始后，要求用户输入：用户名，密码，昵称，年龄
 * 将记录写入到user.dat中。其中用户名，密码，昵称为字符串。年龄为一个int值
 * 每条记录占100字节，其中，用户名，密码，昵称各占32字节，年龄int占4个字节
 * @author admin
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎注册");
		System.out.println("请输入用户名");
		String username=sc.nextLine();
		System.out.println("请输入密码");
		String password=sc.nextLine();
		System.out.println("请输入昵称");
		String nickname=sc.nextLine();
		System.out.println("请输入年龄");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println(username+","+password+","+nickname+","+age);
		RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());//将指针移到文件末尾
		byte[] data=username.getBytes("UTF-8");//将用户名转换为对应的一组字节
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		data=password.getBytes("utf-8");
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		data=nickname.getBytes("utf-8");
		data=Arrays.copyOf(data, 32);
		raf.write(data);
		raf.writeInt(age);
		System.out.println("注册完毕");
		raf.close();
	}

}
