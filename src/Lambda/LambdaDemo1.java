package Lambda;
/**
 * lambda���ʽ
 * lambda������java�Ժ���ʽ���
 * ��������jdk8�Ժ��Ƴ���
 * ʹ��lanbda���Է����ݴ����ڲ���
 * �﷨
 * (�����б�)->{
 * 		������
 * }
 * ʹ��lambda�����������ڲ���ʵ�������Ľӿڱ���ֻ����һ��������������벻��ͨ��
 * @author admin
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		};
		
		//��������ֻ��һ�仰������ȥ��{}
		Runnable r1=()->{
			System.out.println("hello");
		};
		
		
		
	}
}
