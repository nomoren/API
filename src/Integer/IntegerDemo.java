package Integer;
/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题
 * 其中六个数字类型的包装类继承自number类。
 * java.lang.number是一个抽象类，定义了几个抽象方法。要求数字类型的包装类可以将其表示的数字
 * 以任意数字类型返回
 * @author admin
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//int d=1;
		/**
		 * 转为包装类
		 */
		//Integer i=new Integer(1);
		Integer i=Integer.valueOf(1);
		/**
		 * 转回基本类型
		 */
		//d=i.intValue();
		System.out.println(i);
		System.out.println(i.doubleValue());
		/**
		 * 数字类型的包装类定义了两个常量
		 * MAX_VALUE
		 * MIN_VALUE
		 * 用于表示该包装类对应的基本类型的取值范围
		 */
		int max=Integer.MAX_VALUE;
		
	}
}
