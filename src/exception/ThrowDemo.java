package exception;
/**
 * 测试异常的抛出
 * @author admin
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Person p=new Person();
		/*
		 * 满足语法，但是不满足业务逻辑要求，这时setage方法中可以
		 * 当做异常抛出。要求这里调用时处理
		 */
		try {
			/*
			 * 当调用一个含有throws声明异常抛出的方法时，要求必须处理该异常
			 * 处理方式有两种：
			 * 1.使用try-catch捕获并处理异常
			 * 2.在当前方法上继续使用throws声明该异常的抛出
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}
}
