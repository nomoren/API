package thread;
/**
 * �ػ��߳�
 * �ػ��߳��ֳ�Ϊ��̨�̡߳�Ĭ�ϴ������̶߳�����ͨ�߳�
 * ����ǰ̨�̡߳��߳��ṩ��һ��������
 * void setDaemon��boolean on��
 * ֻ�е��ø÷������������trueʱ�����̲߳Żᱻ����Ϊ�ػ��߳�
 * 
 * �ػ��߳���ʹ��������ͨ�̲߳�û�в�𡣵����ڽ���ʱ������һ�����𣬼����߳�
 * ����ʱ�����������е��ػ��̶߳��ᱻǿ��ֹͣ
 *
 *�̵߳Ľ�������һ�����������е���ͨ�̶߳�����ʱ�����̼�����
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
				System.out.println("��ͨ");
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
