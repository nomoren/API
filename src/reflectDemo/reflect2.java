package reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ͨ���������ٴ���ʵ��
 * @author admin
 *
 */
public class reflect2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 * ʵ����person
		 */
		Person p=new Person();
		System.out.println(p);
		/*
		 * ���÷���
		 */
		Class cls=Class.forName("reflectDemo.Person");
		
		/*
		 * class��һ������ʵ��������ķ�����s
		 * newInstance����
		 * ����Ҫע�⣬��classʵ����ʾ�������Ҫ�����޲ι��췽����������ʹ�����ַ�ʽʵ����
		 */
		Object obj=cls.newInstance();
		System.out.println(obj);
		
		/*Constructor c = cls.getConstructor(new Class[]{int.class});
		obj = c.newInstance(5);*/
		
	    Constructor constructor=cls.getConstructor(int.class);
		obj=constructor.newInstance(5);
		
	}

}
