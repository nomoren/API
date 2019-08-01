package reflectDemo;

import java.lang.reflect.Method;

/**
 * java的反射机制，反射机制可以允许我们实例化一个类，调用方法操作属性从编码期改为在运行期决定
 * 并且也可以在运行期间动态的得知一个类的情况，他有哪些方法，属性等
 * 反射机制可以大大提高代码的灵活度，但是实际开发中使用要适度，过度使用反射会减低代码的运行效率
 * @author admin
 *
 */
public class reflect1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * 反射第一步：获取要操作的类的类对象
		 * 
		 * java中每个被jvm加载的类在jvm内部都有且只有一个类对象（class的实例）与之对应
		 * 通过某个类的类对象可以得知这个类的信息（方法，属性等），并且可以进行实例化等操作
		 * 
		 * 想获取一个类 的类对象的方式
		 * 1.类名.class
		 * 	每个类都有一个静态属性：class
		 * 可以直接获取这个类的类对象，当我们明确需要获取某个类的类对象可以使用这种方式
		 *  
		 *  2.通过class的静态方法：forname，
		 *  这种方式我们可以指定想加载的类的名字来获取该类的类对象
		 *  
		 *  3.通过类加载器classLoader
		 */
		
		/*
		 * 1.先获取person的类对象
		 */
		//Class cls=Person.class;
		/*
		 * class.forname(string classname)
		 * 这里加载一个类时指定的字符串为加载类的完全限定名：包名.类名
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
