package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程。默认创建的线程都是普通线程
 * 或者前台线程。线程提供了一个方法：
 * void setDaemon（boolean on）
 * 只有调用该方法并传入参数true时，该线程才会被设置为守护线程
 * 
 * 守护线程在使用上与普通线程并没有差别。但是在结束时机上有一个区别，即：线程
 * 结束时所有正在运行的守护线程都会被强制停止
 *
 *线程的结束：当一个进程中所有的普通线程都结束时，进程即结束
 */
public class DaeminThreadDemo {
	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("噗通");
			}
		};
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump,i jump");
			
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			}
		};
		rose.start();
		jack.setDaemon(true);
		jack.start();
	}

}
