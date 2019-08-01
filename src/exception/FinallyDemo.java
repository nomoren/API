package exception;
/**
 * finally块
 * finally块是异常处理机制的最后一块，可以直接跟在try之后或者最后一个catch之后
 * finally可以确保只要程序运行到try语句中，
 * 那么无论是否抛出异常，finally中的代码必定执行
 * @author admin
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		/*System.out.println("start");
		try {
			String str=" ";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("error");
		}finally {
			System.out.println("finally");
		}*/
		System.out.println(new FinallyDemo().what());
	}
	public boolean what() {
		try {
			String str=" ";
			System.out.println(str.length());
			return true;
		} catch (Exception e) {
			return true;
		}finally {
			return false
					;
		}
	}
}
