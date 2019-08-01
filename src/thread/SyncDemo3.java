package thread;
/**
 * 静态方法若使用synchronized修饰，那么该方法一定具有同步效果
 * 静态方法对应的同步监视器对象为当前类的类对象（class的实例）
 * 类对象会在后面反射的课程中讲
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
		System.out.println(t.getName()+"正在调用dosoem");
		try {
			Thread.sleep(5000);
			System.out.println(t.getName()+"调用完毕");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
