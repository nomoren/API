package exception;

public class ExceptionApiDemo {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//e.printStackTrace(); ���������Ϣ����õ�
			String message=e.getMessage();//��ȡ������Ϣ
			System.out.println(message);
		}
		
		
		
		
		System.out.println("end");
	}
}
