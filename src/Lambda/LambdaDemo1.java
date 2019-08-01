package Lambda;
/**
 * lambda表达式
 * lambda可以让java以函数式编程
 * 该特性是jdk8以后推出的
 * 使用lanbda可以方便快捷创建内部类
 * 语法
 * (参数列表)->{
 * 		方法体
 * }
 * 使用lambda创建的匿名内部类实际所属的接口必须只能有一个方法，否则编译不能通过
 * @author admin
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		};
		
		//当方法中只有一句话，可以去掉{}
		Runnable r1=()->{
			System.out.println("hello");
		};
		
		
		
	}
}
