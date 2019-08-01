package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



import IO.OswDemo;
import IO.PwDemo1;

/**
 * 聊天室客户端
 * @author admin
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * socket封装了tcp协议的通讯细节，使该过程抽象为通过两个流的读写
	 * 完成与远端计算机的数据交换
	 * socket：套接字
	 */
	private Socket socket;
	/*
	 * 构造方法，初始化客户端
	 */
	public Client(){
		try {
			/*
			 * 实例化socket的同时需要传入两个参数
			 * 1.服务端的ip地址
			 * 2.服务端所使用的端口号
			 * 
			 * 通讯ip地址可以找到服务端的计算机。通过端口可以连接到运行在服务端
			 * 计算机上的服务端应用程序。客户端自身ip和端口无需指定，系统会分配一个端口，
			 * 并且连接后会发送给服务端
			 * 
			 * 实例化socket的过程就是发起连接的过程。若服务端没有响应则这里会抛出异常
			 * 127.0.0.1和localhost都是用于表示本机的IP地址
			 */
			System.out.println("正在连接服务端...");
			socket =new Socket("localhost", 8088);
			System.out.println("已连接.");
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * 程序开始工作方法
	 */
	public void start(){
		try {
			/*
			 * socket提供的方法：
			 * outputstream getOutputStream()
			 * 返回一个字节流输出，通过该输出流写出的数据最终发送给服务端
			 */
			OutputStream out =socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out, "utf-8");
			BufferedWriter bw=new BufferedWriter(osw);
			PrintWriter pw=new PrintWriter(bw,true);
			System.out.println("输入：");
			Scanner sc= new Scanner(System.in);
			InputStream in=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(in, "utf-8");
			BufferedReader br=new BufferedReader(isr);
			while(true){
				String s=sc.nextLine();
			pw.println(s);
			String line=br.readLine();
			System.out.println(line);
			}
			
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		Client client=new Client();
		client.start();
	}
}
