package thread;
/**
 * �̵߳����ȼ�
 * �̲߳���������ȡcpuʱ��Ƭ��ֻ�ܱ����ı��̵߳���������
 * �����̵߳����ȼ��������̶ȵĸ���ĳ���̻߳�ȡcpuʱ��Ƭ�Ĵ���
 * �������߳����ȼ�Խ�ߵ��̻߳�ȡ��cpuʱ��Ƭ�Ĵ�����Խ��
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
