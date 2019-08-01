package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalText {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread=new MyThread();
		new Thread(thread).start();
		new Thread(thread).start();
		Thread.sleep(1000);
		System.out.println(thread.getList().size());
	}
	
}




class MyThread implements Runnable{
	//���ÿ���̶߳��������list
	private List<String> list=new ArrayList<String>();
	
	//����local����list����һ���������뵱ǰ�̰߳󶨣�ÿ���̷߳����Լ���list
	private static ThreadLocal<List<String>> threadLocal =new ThreadLocal<>();
	
	@Override
	public void run() {
		List<String> list=threadLocal.get();
		if(list==null) {
			threadLocal.set(this.list);
		}
		threadLocal.get().add(Thread.currentThread().getName()+"aaa");
	}

	public List<String> getList() {
		return list;
	}
		
}