package Integer;
/**
 * jdk1.5版本推出了一个特性：
 * 自动拆装箱
 * 该特性是编译器认可的。
 * @author 范传奇_Xiloer
 *
 */
public class AutoBoxingDemo {
	public static void main(String[] args) {
		int d=new Integer(1);
		Integer a=new Integer(1);
		a=a.intValue();
	//int d=new Integer(1).intValue();
		Integer i=1;
	   //Integer i=Integer.valueOf(1);
	   System.out.println(i);
	   
	}
}
