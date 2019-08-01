package collection;
/**
 * JDK5推出时，推出了一个新特性：
 * 增强型for循环，也称为新循环，for each
 * 新循环不取传统for循环的工作，他专门设计是用来遍历集合或者数组的
 * @author admin
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		/*
		 * 新循环的语法也是编译器认可的，而非虚拟机认可。编译器会在编译源代码时
		 * 将新循环遍历数组改为传统for循环遍历的方式
		 */
		//定义string类型变量str，接收array里的每个元素
		for(String str:array){
			System.out.println(str);
		}
	}
}
