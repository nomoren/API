package thread;
/**
 * 互斥锁
 * 当多个代码片段被synchronized块修饰后，这些同步块的同步监听器对象又是
 * 同一个时，这些代码片段时互斥的。多个线程不能同时在这些方法中运行
 * @author admin
 *
 */
public class SyncDemo4 {
	public synchronized static void main(String[] args) {
		Aoo aoo=new Aoo();
		Thread t1=new Thread(){
			public void run(){
				aoo.A();
							}
		};
		Thread t2=new Thread(){
			public void run(){
				aoo.B();
			}
		};
		t1.start();
		t2.start();
	}

}
class Aoo{
	public  synchronized void A(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"正在条用A方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+"运行完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void B(){
		synchronized (this) {
			Thread t=Thread.currentThread();
			try {
				System.out.println(t.getName()+"正在条用B方法");
				Thread.sleep(5000);
				System.out.println(t.getName()+"运行完毕");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
