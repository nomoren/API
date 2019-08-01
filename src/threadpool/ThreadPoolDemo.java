package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 作用：
 * 1.控制线程数量
 * 2.重用线程
 * @author admin
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadpool=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			Runnable run=new Runnable() {
				public void run() {
					Thread t=Thread.currentThread();
					try {
						System.out.println(t.getName()+":正在运行任务");
						Thread.sleep(5000);
						System.out.println(t.getName()+":运行完毕");
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			};
			//将任务给线程池
			threadpool.execute(run);
			System.out.println("指派了一个任务给线程池");
			
		}
		/*
		 * 停止线程池，shutdown方法调用后，线程池不再接受新任务，并且会将线程池中所有的任务
		 * 执行完毕后自动停止
		 * shutdNow方法调用后，线程池会强制中断所有线程立即停止
		 */
		threadpool.shutdown();
		System.out.println("停止");
		
	}
}
