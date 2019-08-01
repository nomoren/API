package reflectDemo;

import java.util.Arrays;

/**
 * jdk5之后退出了一个新特性
 * 可变参数
 * 一个方法中可变参数只有一个，放在最后面，不再跟其他参数
 * @author admin
 *
 */
public class ArgDemo {
	public static void main(String[] args) {
		dosome("a");
		dosome("a","b");
		dosome("a","b","c");
	}
	public static void dosome(String...s){
		System.out.println("方法开始");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		System.out.println("方法结束");
	}
	public static void dosome(int i,String...s){
		
	}
}
