package thread;
/**
 * �߳��ṩ�˻�ȡ�����Ϣ�ķ���
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		/*
		 * �߳��ṩ��һ����̬����
		 * static Thread currThread()
		 * �÷���������ȡ��������������߳�
		 * main����Ҳ�ǿ�һ���߳���ִ��main������������̵߳�����
		 * �С�main�������ǳ���Ϊ���߳�
		 * 
		 * ��ȡmain�������߳�
		 */
		Thread main=Thread.currentThread();
		System.out.println("����main�������̣߳�"+main);
		dosome();
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("�Զ����߳�+"+t);
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("����dosome���̣߳�"+t);
	}
}
