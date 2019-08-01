package thread;
/**
 * 线程是并发运行代码的
 * 有2种创建线程的方式：
 * 1.继承Thread并重写run方法。run方法中就是希望线程执行的逻辑
 * @author admin
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * 启动线程要调用start方法，而不是直接调用run方法。
		 * 当start方法调用完毕后，run方法很快会被线程自行调用 
		 */
		t1.start();
		t2.start();
		
	}
}
/*
 * 第一种创建线程的方式比较简单直接，有两个缺点
 * 1.由于需要继承线程，导致不能再继承其他类。实际开发过程中经常需要复用
 * 某个超类的功能。那么在继承线程后不能再继承其他类会很不方便
 * 2.定义线程的同时重写了run方法，这回导致线程与线程要执行的任务有一个
 * 必然的耦合关系，不利于线程的重用
 */
class MyThread1 extends Thread{
	
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println(i+"你是谁啊");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=1;i<1000;i++){
			System.out.println(i+"我是差水表的");
		}
	}
}
