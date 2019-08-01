package exception;

public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(text("0")+","+text(null)+","+text(""));
	}
	public static int text(String str){
		try {
			System.out.println("str:"+str);
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
			return 1;
		}catch(Exception e){
			System.out.println("其他异常");
			return 2;
		}finally{
			return 3;
		}
	}
}
