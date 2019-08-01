package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * ���ã�
 * 1.�����߳�����
 * 2.�����߳�
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
						System.out.println(t.getName()+":������������");
						Thread.sleep(5000);
						System.out.println(t.getName()+":�������");
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			};
			//��������̳߳�
			threadpool.execute(run);
			System.out.println("ָ����һ��������̳߳�");
			
		}
		/*
		 * ֹͣ�̳߳أ�shutdown�������ú��̳߳ز��ٽ��������񣬲��һὫ�̳߳������е�����
		 * ִ����Ϻ��Զ�ֹͣ
		 * shutdNow�������ú��̳߳ػ�ǿ���ж������߳�����ֹͣ
		 */
		threadpool.shutdown();
		System.out.println("ֹͣ");
		
	}
}
