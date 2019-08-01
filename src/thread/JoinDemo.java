package thread;

import javax.management.RuntimeErrorException;

/**
 * 线程提供了一个方法
 * void join（）
 * 该方法可以协调线程之间的同步运行
 * 同步与异步
 * 同步运行：运行有顺序
 * 异步运行：运行代码无顺序，多线程并发运行就是异步运行
 * @author admin
 *
 */
public class JoinDemo {
	//标示图片是否下载完毕
	private static boolean isFinish=false;
	
	public static void main(String[] args) {
		Thread download=new Thread(){
			public void run(){
				System.out.println("开始下载图片");
				for(int i=0;i<100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("下载完毕");
				isFinish=true;
			}
		};
		Thread show =new Thread(){
			public void run(){
				System.out.println("开始显示图片");
				//加载图片前应该等待下载线程将图片下载完毕
				try {
					/*
					 * show线程在调用download.join（）方法后就进入了阻塞状态。
					 * 知道download线程的run方法执行完毕后才会解除阻塞
					 */
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("加载失败");
				}
				System.out.println("加载完毕");
			}
		};
		download.start();
		show.start();
		
		
	}
}
