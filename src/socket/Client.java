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
 * �����ҿͻ���
 * @author admin
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * socket��װ��tcpЭ���ͨѶϸ�ڣ�ʹ�ù��̳���Ϊͨ���������Ķ�д
	 * �����Զ�˼���������ݽ���
	 * socket���׽���
	 */
	private Socket socket;
	/*
	 * ���췽������ʼ���ͻ���
	 */
	public Client(){
		try {
			/*
			 * ʵ����socket��ͬʱ��Ҫ������������
			 * 1.����˵�ip��ַ
			 * 2.�������ʹ�õĶ˿ں�
			 * 
			 * ͨѶip��ַ�����ҵ�����˵ļ������ͨ���˿ڿ������ӵ������ڷ����
			 * ������ϵķ����Ӧ�ó��򡣿ͻ�������ip�Ͷ˿�����ָ����ϵͳ�����һ���˿ڣ�
			 * �������Ӻ�ᷢ�͸������
			 * 
			 * ʵ����socket�Ĺ��̾��Ƿ������ӵĹ��̡��������û����Ӧ��������׳��쳣
			 * 127.0.0.1��localhost�������ڱ�ʾ������IP��ַ
			 */
			System.out.println("�������ӷ����...");
			socket =new Socket("localhost", 8088);
			System.out.println("������.");
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * ����ʼ��������
	 */
	public void start(){
		try {
			/*
			 * socket�ṩ�ķ�����
			 * outputstream getOutputStream()
			 * ����һ���ֽ��������ͨ���������д�����������շ��͸������
			 */
			OutputStream out =socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out, "utf-8");
			BufferedWriter bw=new BufferedWriter(osw);
			PrintWriter pw=new PrintWriter(bw,true);
			System.out.println("���룺");
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
