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
	//这里，每个线程都访问这个list
	private List<String> list=new ArrayList<String>();
	
	//加了local。把list复制一个副本，与当前线程绑定，每个线程访问自己的list
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