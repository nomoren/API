package reflectDemo;

import java.lang.reflect.Method;

/**
 * java�ķ�����ƣ�������ƿ�����������ʵ����һ���࣬���÷����������Դӱ����ڸ�Ϊ�������ھ���
 * ����Ҳ�����������ڼ䶯̬�ĵ�֪һ����������������Щ���������Ե�
 * ������ƿ��Դ����ߴ�������ȣ�����ʵ�ʿ�����ʹ��Ҫ�ʶȣ�����ʹ�÷������ʹ��������Ч��
 * @author admin
 *
 */
public class reflect1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * �����һ������ȡҪ��������������
		 * 
		 * java��ÿ����jvm���ص�����jvm�ڲ�������ֻ��һ�������class��ʵ������֮��Ӧ
		 * ͨ��ĳ������������Ե�֪��������Ϣ�����������Եȣ������ҿ��Խ���ʵ�����Ȳ���
		 * 
		 * ���ȡһ���� �������ķ�ʽ
		 * 1.����.class
		 * 	ÿ���඼��һ����̬���ԣ�class
		 * ����ֱ�ӻ�ȡ����������󣬵�������ȷ��Ҫ��ȡĳ�������������ʹ�����ַ�ʽ
		 *  
		 *  2.ͨ��class�ľ�̬������forname��
		 *  ���ַ�ʽ���ǿ���ָ������ص������������ȡ����������
		 *  
		 *  3.ͨ���������classLoader
		 */
		
		/*
		 * 1.�Ȼ�ȡperson�������
		 */
		//Class cls=Person.class;
		/*
		 * class.forname(string classname)
		 * �������һ����ʱָ�����ַ���Ϊ���������ȫ�޶���������.����
		 */
		Class cls=Class.forName("reflectDemo.Person");
		String name=cls.getName();
		System.out.println(name);
		Class c=Person.class;
		String n=c.getName();
		System.out.println(c);
		
		/* Method[] method=cls.getMethods();
		 for (Method method2 : method) {
			System.out.println(method2.getName());
		}*/
	
	
	
	
	
	
	
	
	
	
	}
	
}
