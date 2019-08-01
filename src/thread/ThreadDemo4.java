package thread;
/**
 * 线程提供了获取自身信息的相关方法
 * @author admin
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//获取名字
		String name=main.getName();
		System.out.println(name);
		//获取唯一标示符 id
		long id=main.getId();
		System.out.println(id);
		//获取线程优先级
		int priority=main.getPriority();
		System.out.println(priority);
		//线程是否还处于活动状态
		boolean isAlive=main.isAlive();
		//线程是否为守护线程
		boolean isDaemon=main.isDaemon();
		System.out.println("islives:"+isAlive+",isdaemo:"+isDaemon);
		//线程是否被中断了
		boolean i=main.isInterrupted();
	}
}
