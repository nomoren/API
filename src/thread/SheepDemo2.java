package thread;
/**
 * sleep要求必须处理中断异常。原因在于当一个线程调用了他的interrupt（）方法
 * 中断时，它就会在sleep方法中抛出中断异常，这时并非是将这个线程直接中断，
 * 而是中断了他的阻塞状态
 * @author admin
 *
 */
public class SheepDemo2 {
	public static void main(String[] args) {
		/*
		 * jdk8之前，由于jvm内存分配问题，有一个要求：
		 * 当一个方法的局部变量被这个方法的其他局部内部类所引用时，这个变量声明必须是final的
		 */
		Thread lin=new Thread(){
			public void run(){
				System.out.println("林：刚美完容，睡一觉");
				try {
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				
					System.out.println("吵死了");
				}
				System.out.println("干嘛呢");
			}
		};
		Thread wan =new Thread(){
				public void run(){
					
					for(int i=1;i<5;i++){
						System.out.println("王：80");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("搞定");
					lin.interrupt();
				}
		};
		lin.start();
		wan.start();
		
		
	}
}
