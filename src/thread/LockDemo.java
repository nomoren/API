package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	private static int num;
	Lock lock=new ReentrantLock();
	public static void main(String[] args) {
		Runnable r1=()->{
			new LockDemo().add();
		};
		
		Runnable r2=()->{
			new LockDemo().add();
		};
		new Thread(r1).start();
		new Thread(r2).start();
	}
	private void add() {
	
		lock.lock();//»ñÈ¡Ëø
		try {
			this.num++;
			System.out.println(num);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();//ÊÍ·ÅËø
		}
	}
}
