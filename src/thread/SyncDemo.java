package thread;
/**
 * 对线程并发的安全问题
 * 产生：当多个线程并发操作同一资源时，由于线程切换实际的不确定性，
 * 回导致执行操作资源的代码顺序未按照设计顺序执行，出现操作混乱的
 * 情况。严重时可能导致系统瘫痪
 * 
 * 解决：将并发操作的同一资源改为同步擦操作。即:有先后顺序的操作
 * @author admin
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
				int bean=table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				while(true){
				int bean=table.getBean();
				System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans=20;
	/*
	 * 当一个方法被synchronized修饰后，该方法称为同步方法，即：多个线程不能在方法内部运行
	 * 强制让多个线程在执行同一个方法时变为同步操作就解决了并发安全问题
	 * 
	 * 在方法上使用synchronized，那么同步监视器对象就是当前方法所属对象。
	 * 即：方法内部看到的this
	 */
	public synchronized int getBean(){
		if(beans==0){
			//System.out.println("没哟");
			throw new RuntimeException("没有豆子了");
		}
		//模拟线程执行到这里没时间了
		Thread.yield();
		return beans--;
	}
}