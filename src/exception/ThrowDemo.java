package exception;
/**
 * �����쳣���׳�
 * @author admin
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Person p=new Person();
		/*
		 * �����﷨�����ǲ�����ҵ���߼�Ҫ����ʱsetage�����п���
		 * �����쳣�׳���Ҫ���������ʱ����
		 */
		try {
			/*
			 * ������һ������throws�����쳣�׳��ķ���ʱ��Ҫ����봦����쳣
			 * ����ʽ�����֣�
			 * 1.ʹ��try-catch���񲢴����쳣
			 * 2.�ڵ�ǰ�����ϼ���ʹ��throws�������쳣���׳�
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}
}
