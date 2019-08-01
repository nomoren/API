package exception;

public class ExceptionApiDemo {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//e.printStackTrace(); 输出错误信息，最常用的
			String message=e.getMessage();//获取错误信息
			System.out.println(message);
		}
		
		
		
		
		System.out.println("end");
	}
}
