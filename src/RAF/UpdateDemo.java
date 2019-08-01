package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 * 程序启动后，要求用户输入要修改的用户名以及新的昵称
 * 然后将用户昵称进行修改操作
 * 若输入的用户名不存在，则提示无此用户
 * 
 * 1.获取用户名和新昵称
 * 2.使用raf打开user.dat文件
 * 3.循环每条记录
 * 		1.将指针移动到该条记录用户名的位置
 * 		2.读取32字节。将用户名读取出来
 * 		3.判断用户是否存在
 * 		4.若是，指针移动到该条记录昵称的位置，修改
 * 		5.若不是。continue
 * 		可以添加一个开关，当修改过昵称后，改变其值，最终在循环完后，根据开关的值来判定是否有修改信息来输出无此用户
 * @author admin
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("输入用户名");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
		int n=0;
		boolean on = false;
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(100*i);
			byte[] data=new byte[32];
			raf.read(data);
			String username=new String(data,"UTF-8").trim();
			if(username.equals(name)){
				raf.seek(n+64);
				System.out.println("输入新昵称");
				String newname=sc.nextLine();
				data=newname.getBytes("utf-8");
				data=Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改完毕");
				on=true;
				break;
			}else{
				n+=100;
				continue;
			}
			
		}
		if(!on){
			System.out.println("无此用户");
		}
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
