package thread;
/**
 * sleepҪ����봦���ж��쳣��ԭ�����ڵ�һ���̵߳���������interrupt��������
 * �ж�ʱ�����ͻ���sleep�������׳��ж��쳣����ʱ�����ǽ�����߳�ֱ���жϣ�
 * �����ж�����������״̬
 * @author admin
 *
 */
public class SheepDemo2 {
	public static void main(String[] args) {
		/*
		 * jdk8֮ǰ������jvm�ڴ�������⣬��һ��Ҫ��
		 * ��һ�������ľֲ���������������������ֲ��ڲ���������ʱ�������������������final��
		 */
		Thread lin=new Thread(){
			public void run(){
				System.out.println("�֣��������ݣ�˯һ��");
				try {
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				
					System.out.println("������");
				}
				System.out.println("������");
			}
		};
		Thread wan =new Thread(){
				public void run(){
					
					for(int i=1;i<5;i++){
						System.out.println("����80");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("�㶨");
					lin.interrupt();
				}
		};
		lin.start();
		wan.start();
		
		
	}
}
