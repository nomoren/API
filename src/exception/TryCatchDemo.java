package exception;
/**
 * java异常处理机制中的try-catch
 * try语句块用来包含可能出错的代码片段，catch用来捕获这些错误并针对
 * 该错误进行处理
 * 
		 * 当jvm执行代码时发现一个错误时，会根据错误实例化对应的异常实例，
		 * 并将程序执行过程设置进去，然后将该异常出错的位置抛出
		 * 之后jvm会检查抛出的异常是否有被try-catch处理，若没有则认为出错的语句
		 * 所在方法没有解决异常的能力。随之将异常抛出到该方法之外
		 
 * @author admin
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("start");
		try{
		String str="a";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("ok");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("数组下标越界异常");
		}catch(Exception e){
			System.out.println("出现未知错误");
		}
		System.out.println("end");
	}
}
