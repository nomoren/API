package thread;
/**
 * ������
 * ���������Ƭ�α�synchronized�����κ���Щͬ�����ͬ����������������
 * ͬһ��ʱ����Щ����Ƭ��ʱ����ġ�����̲߳���ͬʱ����Щ����������
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
			System.out.println(t.getName()+"��������A����");
			Thread.sleep(5000);
			System.out.println(t.getName()+"�������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void B(){
		synchronized (this) {
			Thread t=Thread.currentThread();
			try {
				System.out.println(t.getName()+"��������B����");
				Thread.sleep(5000);
				System.out.println(t.getName()+"�������");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
