package thread;
/**
 * �߳��ṩ�˻�ȡ������Ϣ����ط���
 * @author admin
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//��ȡ����
		String name=main.getName();
		System.out.println(name);
		//��ȡΨһ��ʾ�� id
		long id=main.getId();
		System.out.println(id);
		//��ȡ�߳����ȼ�
		int priority=main.getPriority();
		System.out.println(priority);
		//�߳��Ƿ񻹴��ڻ״̬
		boolean isAlive=main.isAlive();
		//�߳��Ƿ�Ϊ�ػ��߳�
		boolean isDaemon=main.isDaemon();
		System.out.println("islives:"+isAlive+",isdaemo:"+isDaemon);
		//�߳��Ƿ��ж���
		boolean i=main.isInterrupted();
	}
}
