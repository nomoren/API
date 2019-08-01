package thread;
/**
 * 第二种创建线程的方式
 * 实现Runable接口，单独定义线程任务
 * @author admin
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//实例化两个任务
		Runnable r1=new myRunnble1();
		Runnable r2=new myRunnble2();
		//创建两个线程并指派任务
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}
}
class myRunnble1 implements  Runnable{
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println("你是谁啊");
		}
	}
}
class myRunnble2 implements Runnable{
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println("我是查水表的");
		}
	}
}