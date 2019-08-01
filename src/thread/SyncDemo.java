package thread;
/**
 * ���̲߳����İ�ȫ����
 * ������������̲߳�������ͬһ��Դʱ�������߳��л�ʵ�ʵĲ�ȷ���ԣ�
 * �ص���ִ�в�����Դ�Ĵ���˳��δ�������˳��ִ�У����ֲ������ҵ�
 * ���������ʱ���ܵ���ϵͳ̱��
 * 
 * �����������������ͬһ��Դ��Ϊͬ������������:���Ⱥ�˳��Ĳ���
 * @author admin
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
				int bean=table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				while(true){
				int bean=table.getBean();
				System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans=20;
	/*
	 * ��һ��������synchronized���κ󣬸÷�����Ϊͬ����������������̲߳����ڷ����ڲ�����
	 * ǿ���ö���߳���ִ��ͬһ������ʱ��Ϊͬ�������ͽ���˲�����ȫ����
	 * 
	 * �ڷ�����ʹ��synchronized����ôͬ��������������ǵ�ǰ������������
	 * ���������ڲ�������this
	 */
	public synchronized int getBean(){
		if(beans==0){
			//System.out.println("ûӴ");
			throw new RuntimeException("û�ж�����");
		}
		//ģ���߳�ִ�е�����ûʱ����
		Thread.yield();
		return beans--;
	}
}