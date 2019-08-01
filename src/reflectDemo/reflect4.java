package reflectDemo;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author admin
 *
 */
public class reflect4 {
	public static void main(String[] args) throws Exception {
		Class cls=Class.forName("reflectDemo.Person");
		Object o=cls.newInstance();
		
		Method method=cls.getMethod("saiHello", Class.forName("java.lang.String"));
		//Method method=cls.getMethod("saiHello", String.class);
		method.invoke(o, "张三");
		
		Method m2=cls.getMethod("saiHello", String.class,int.class);
		m2.invoke(o, "张三",25);
	}
	
	
}
