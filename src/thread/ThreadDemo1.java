package thread;
/**
 * �߳��ǲ������д����
 * ��2�ִ����̵߳ķ�ʽ��
 * 1.�̳�Thread����дrun������run�����о���ϣ���߳�ִ�е��߼�
 * @author admin
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * �����߳�Ҫ����start������������ֱ�ӵ���run������
		 * ��start����������Ϻ�run�����ܿ�ᱻ�߳����е��� 
		 */
		t1.start();
		t2.start();
		
	}
}
/*
 * ��һ�ִ����̵߳ķ�ʽ�Ƚϼ�ֱ�ӣ�������ȱ��
 * 1.������Ҫ�̳��̣߳����²����ټ̳������ࡣʵ�ʿ��������о�����Ҫ����
 * ĳ������Ĺ��ܡ���ô�ڼ̳��̺߳����ټ̳��������ܲ�����
 * 2.�����̵߳�ͬʱ��д��run��������ص����߳����߳�Ҫִ�е�������һ��
 * ��Ȼ����Ϲ�ϵ���������̵߳�����
 */
class MyThread1 extends Thread{
	
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println(i+"����˭��");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=1;i<1000;i++){
			System.out.println(i+"���ǲ�ˮ���");
		}
	}
}
