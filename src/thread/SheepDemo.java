package thread;

import java.util.Scanner;

/**
 * 线程提供了一个静态方法
 * static void sleep(long ms)
 * 使运行这个方法的线程阻塞指定毫秒。超时后该线程会自动返回到runnable状态
 * 等待再次并发运行
 * @author admin
 *
 */
public class SheepDemo {
	public static void main(String[] args) {
		System.out.println("输入数字：");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=Integer.parseInt(s);
		test(n);
		
	}
	public static void test(int n){
		while(n>=0){
			System.out.println(n);
			n--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("结束");
	}
}
	