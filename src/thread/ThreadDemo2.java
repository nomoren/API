package thread;
/**
 * �ڶ��ִ����̵߳ķ�ʽ
 * ʵ��Runable�ӿڣ����������߳�����
 * @author admin
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		//ʵ������������
		Runnable r1=new myRunnble1();
		Runnable r2=new myRunnble2();
		//���������̲߳�ָ������
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}
}
class myRunnble1 implements  Runnable{
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println("����˭��");
		}
	}
}
class myRunnble2 implements Runnable{
	public void run() {
		for(int i=1;i<1000;i++){
			System.out.println("���ǲ�ˮ���");
		}
	}
}