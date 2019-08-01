package thread;
/**
 * 线程的优先级
 * 线程不能主动获取cpu时间片，只能被动的被线程调度器分配
 * 调整线程的优先级可以最大程度的改善某个线程获取cpu时间片的次数
 * 理论上线程优先级越高的线程获取的cpu时间片的次数就越多
 * @author admin
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		min.start();
		norm.start();
		
	}
}
