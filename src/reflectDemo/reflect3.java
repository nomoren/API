package reflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射调用方法
 * @author admin
 *
 */
public class reflect3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p=new Person();
		p.saiHai();
		/*
		 * 利用反射
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要加载的类:");
		Class cls=Class.forName(sc.nextLine());
		Object o=cls.newInstance();
		/*
		 * 获取其定义的方法，method的每个实例表示一个类中的一个具体方法
		 * 
		 */
		System.out.println("请输入要调用的方法：");
		Method method=cls.getMethod(sc.nextLine(), null);
		/*
		 *调用该方法
		 */
		method.invoke(o, null);
		
	}
}
