package exception;
/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author admin
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/*
	 * ͨ��һ��������ʹ��throw�׳�һ���쳣ʱ����Ҫ�ڷ�������ʱʹ��throws����
	 * ���쳣���׳��Լ�֪ͨ�����߽�����쳣
	 * ֻ���׳�runtimeexception�����������쳣ʱ���Բ�Ҫ��������
	 * 
	 */
	public void setAge(int age) throws IllegalAgeException {
		
		if(age<0||age>100){
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	
	}
	
}
