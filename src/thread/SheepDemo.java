package thread;

import java.util.Scanner;

/**
 * �߳��ṩ��һ����̬����
 * static void sleep(long ms)
 * ʹ��������������߳�����ָ�����롣��ʱ����̻߳��Զ����ص�runnable״̬
 * �ȴ��ٴβ�������
 * @author admin
 *
 */
public class SheepDemo {
	public static void main(String[] args) {
		System.out.println("�������֣�");
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
		System.out.println("����");
	}
}
	