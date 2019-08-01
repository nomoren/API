package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ҷ����
 * @author admin
 *
 */
public class Server {
	/*
	 * �����ڷ���˵�ServerSocket
	 * ����������
	 * 1.��ϵͳ�������˿ڣ��ͻ��˾���ͨ������˿������˳��������ӵ�
	 * 2.�����ö˿ڣ����ͻ���ͨ���ö˿������˽�������ʱ���Զ�����һ��socket��
	 * ͨ�����scoket��ͻ��˽������ݽ���
	 */
	private ServerSocket server;
	/*
	 * ���������ڱ�������ClientHandler�ڲ���Ӧ�ͻ��˵���������Ա�㲥��Ϣ��
	 * 
	 * �����ڲ�����Է������Ӧ�ⲿ������ԣ��Դ�������server�ж�������飬���е�
	 * �ڲ���ClientHandler�����Կ���������������ЩClientHandler��Ҫ��������ݴ���
	 * ������鼴�ɡ�
	 */
	//private PrintWriter[] allOut={};
	private Collection<PrintWriter> allOut=new ArrayList<PrintWriter>();
	public Server(){
		try {
			/*
			 * ʵ����ServerSocket��ͬʱ��ϵͳ�������˿ڣ��ö˿ڲ�����ϵͳ���е�
			 * ����������ͬ��������׳���ַ��ռ�õ��쳣
			 */
			System.out.println("�������������...");
			server=new ServerSocket(8088);
			System.out.println("������������");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void start(){
		try {
			/*
			 * ServerSocket��һ����Ҫ�ķ���
			 * Socket.accept();.
			 * �÷�����һ���������������ú������������ס�ˡ�����ʱ��ʼ��������˿�
			 * �ȴ��ͻ��˵����ӡ���ô�ͻ���ͨ���˿ڳ�������ʱ��accept�᷵��һ��socket��
			 * ͨ����scoket�Ϳ�����ս������ӵĿͻ��˽��н�����
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������..");
				Socket socket=server.accept();
				System.out.println("�ͻ���������.");
				//����һ���߳�������ÿͻ���
				ClientHandler handler=new ClientHandler(socket);
				Thread t=new Thread(handler);
				t.start();
				}
		
			
			
			/*
			 * ͨ��scoket��ȡ����������ȡ�ͻ��˷��͵�����
			 */
			
		
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		Server server=new Server();
		server.start();
	}
	/*
	 * ���߳���������ָ����scoket��Ӧ�Ŀͻ�������������ݽ���
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		//��¼��ǰ�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		private PrintWriter pw=null;
		public ClientHandler(Socket socket){
			this.socket=socket;
			/*
			 * ͨ��socket��ȡ�������ַ��Ϣ�����ڷ���ˣ��ͻ��˾���Զ�ˣ�
			 */
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run() {
			System.out.println("������һ���̴߳���ͻ�����Ϣ");
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"utf-8");
				BufferedReader br=new BufferedReader(isr);
				/*
				 * ͨ��socket��ȡ����������ͻ��˷���Ϣ
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out, "utf-8");
				BufferedWriter bw=new BufferedWriter(osw);
				 pw=new PrintWriter(bw,true);
				/*
				 * ����ǰClientHandler��Ӧ�ͻ��˵���������뵽allout�����С�
				 * �Ա�����ClientHandler�ڽ�����Ϣ����Խ���Ϣ���͸��ͻ���
				 * 
				 * 1.�ȶ�allout��������
				 * 2.����ǰ��pw���뵽�������һ��λ����
				 */
				 synchronized (allOut) {
					/* allOut=Arrays.copyOf(allOut, allOut.length+1);
						allOut[allOut.length-1]=pw;*/
					 allOut.add(pw);
				}
				
				String str=null;
				while((str=br.readLine())!=null){
					/*if("exit".equals(str)){
						System.out.println("�رշ����");
						break;
					}*/
				//System.out.println("�Է�˵��"+str);
					//����outall������Ϣ���͸���Ӵ�ͻ���
				 synchronized (allOut){
					for(PrintWriter o:allOut){
						o.println(host +str);
					}
				}
				
				}
			
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				//����ǰ�ͻ��˵������pw��allout������ɾ��
				synchronized (allOut){
					System.out.println("һ���ͻ�������");
					allOut.remove(pw);
				/*for(int i=0;i<allOut.length;i++){
					if(allOut[i]==pw){
						allOut[i]=allOut[allOut.length-1];
						allOut=Arrays.copyOf(allOut, allOut.length-1);
						break;
					}
				}*/
			 }
				
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
