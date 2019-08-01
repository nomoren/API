package reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过类对象快速创建实例
 * @author admin
 *
 */
public class reflect2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 * 实例化person
		 */
		Person p=new Person();
		System.out.println(p);
		/*
		 * 利用反射
		 */
		Class cls=Class.forName("reflectDemo.Person");
		
		/*
		 * class有一个快速实例化对象的方法：s
		 * newInstance（）
		 * 但是要注意，该class实例表示的类必须要包含无参构造方法，否则不能使用这种方式实例化
		 */
		Object obj=cls.newInstance();
		System.out.println(obj);
		
		/*Constructor c = cls.getConstructor(new Class[]{int.class});
		obj = c.newInstance(5);*/
		
	    Constructor constructor=cls.getConstructor(int.class);
		obj=constructor.newInstance(5);
		
	}

}
