package thread;
/**
 * ��̬������ʹ��synchronized���Σ���ô�÷���һ������ͬ��Ч��
 * ��̬������Ӧ��ͬ������������Ϊ��ǰ��������class��ʵ����
 * �������ں��淴��Ŀγ��н�
 * @author admin
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}

}
class Foo{
	public synchronized static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+"���ڵ���dosoem");
		try {
			Thread.sleep(5000);
			System.out.println(t.getName()+"�������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
