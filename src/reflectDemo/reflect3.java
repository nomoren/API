package reflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���÷�����÷���
 * @author admin
 *
 */
public class reflect3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p=new Person();
		p.saiHai();
		/*
		 * ���÷���
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ���ص���:");
		Class cls=Class.forName(sc.nextLine());
		Object o=cls.newInstance();
		/*
		 * ��ȡ�䶨��ķ�����method��ÿ��ʵ����ʾһ�����е�һ�����巽��
		 * 
		 */
		System.out.println("������Ҫ���õķ�����");
		Method method=cls.getMethod(sc.nextLine(), null);
		/*
		 *���ø÷���
		 */
		method.invoke(o, null);
		
	}
}
