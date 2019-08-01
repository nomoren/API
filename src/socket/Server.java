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
 * 聊天室服务端
 * @author admin
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket
	 * 有两个作用
	 * 1.向系统申请服务端口，客户端就是通过这个端口与服务端程序建立连接的
	 * 2.监听该端口，当客户端通过该端口与服务端建立连接时会自动创建一个socket。
	 * 通过这个scoket与客户端进行数据交互
	 */
	private ServerSocket server;
	/*
	 * 该数组用于保存所有ClientHandler内部对应客户端的输出流，以便广播信息。
	 * 
	 * 由于内部类可以访问其对应外部类的属性，对此我们在server中定义该数组，所有的
	 * 内部类ClientHandler都可以看到他，这样将这些ClientHandler需要共享的数据存入
	 * 这个数组即可。
	 */
	//private PrintWriter[] allOut={};
	private Collection<PrintWriter> allOut=new ArrayList<PrintWriter>();
	public Server(){
		try {
			/*
			 * 实例化ServerSocket的同时向系统申请服务端口，该端口不能与系统运行的
			 * 其他程序相同，否则会抛出地址被占用的异常
			 */
			System.out.println("正在启动服务端...");
			server=new ServerSocket(8088);
			System.out.println("服务端启动完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void start(){
		try {
			/*
			 * ServerSocket有一个重要的方法
			 * Socket.accept();.
			 * 该方法是一个阻塞方法，调用后程序就在这里”卡住了“，这时开始监听服务端口
			 * 等待客户端的连接。那么客户端通过端口尝试连接时，accept会返回一个socket，
			 * 通过该scoket就可以与刚建立连接的客户端进行交互了
			 */
			while(true){
				System.out.println("等待客户端连接..");
				Socket socket=server.accept();
				System.out.println("客户端已连接.");
				//启动一个线程来处理该客户端
				ClientHandler handler=new ClientHandler(socket);
				Thread t=new Thread(handler);
				t.start();
				}
		
			
			
			/*
			 * 通过scoket获取输入流，读取客户端发送的数据
			 */
			
		
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		Server server=new Server();
		server.start();
	}
	/*
	 * 该线程任务是与指定的scoket对应的客户端任务进行数据交互
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		//记录当前客户端的地址信息
		private String host;
		private PrintWriter pw=null;
		public ClientHandler(Socket socket){
			this.socket=socket;
			/*
			 * 通过socket获取计算机地址信息（对于服务端，客户端就是远端）
			 */
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run() {
			System.out.println("启动了一个线程处理客户端信息");
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"utf-8");
				BufferedReader br=new BufferedReader(isr);
				/*
				 * 通过socket获取输出流，给客户端发消息
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out, "utf-8");
				BufferedWriter bw=new BufferedWriter(osw);
				 pw=new PrintWriter(bw,true);
				/*
				 * 将当前ClientHandler对应客户端的输出流存入到allout数组中。
				 * 以便其他ClientHandler在接收消息后可以将消息发送给客户端
				 * 
				 * 1.先对allout数组扩容
				 * 2.将当前的pw存入到数组最后一个位置上
				 */
				 synchronized (allOut) {
					/* allOut=Arrays.copyOf(allOut, allOut.length+1);
						allOut[allOut.length-1]=pw;*/
					 allOut.add(pw);
				}
				
				String str=null;
				while((str=br.readLine())!=null){
					/*if("exit".equals(str)){
						System.out.println("关闭服务端");
						break;
					}*/
				//System.out.println("对方说："+str);
					//遍历outall，将消息发送给所哟客户端
				 synchronized (allOut){
					for(PrintWriter o:allOut){
						o.println(host +str);
					}
				}
				
				}
			
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				//将当前客户端的输出流pw从allout数组中删除
				synchronized (allOut){
					System.out.println("一个客户端下线");
					allOut.remove(pw);
				/*for(int i=0;i<allOut.length;i++){
					if(allOut[i]==pw){
						allOut[i]=allOut[allOut.length-1];
						allOut=Arrays.copyOf(allOut, allOut.length-1);
						break;
					}
				}*/
			 }
				
				//处理客户端断开连接后的操作
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
