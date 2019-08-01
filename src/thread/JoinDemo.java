package thread;

import javax.management.RuntimeErrorException;

/**
 * �߳��ṩ��һ������
 * void join����
 * �÷�������Э���߳�֮���ͬ������
 * ͬ�����첽
 * ͬ�����У�������˳��
 * �첽���У����д�����˳�򣬶��̲߳������о����첽����
 * @author admin
 *
 */
public class JoinDemo {
	//��ʾͼƬ�Ƿ��������
	private static boolean isFinish=false;
	
	public static void main(String[] args) {
		Thread download=new Thread(){
			public void run(){
				System.out.println("��ʼ����ͼƬ");
				for(int i=0;i<100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("�������");
				isFinish=true;
			}
		};
		Thread show =new Thread(){
			public void run(){
				System.out.println("��ʼ��ʾͼƬ");
				//����ͼƬǰӦ�õȴ������߳̽�ͼƬ�������
				try {
					/*
					 * show�߳��ڵ���download.join����������ͽ���������״̬��
					 * ֪��download�̵߳�run����ִ����Ϻ�Ż�������
					 */
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("����ʧ��");
				}
				System.out.println("�������");
			}
		};
		download.start();
		show.start();
		
		
	}
}
