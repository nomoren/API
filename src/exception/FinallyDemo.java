package exception;
/**
 * finally��
 * finally�����쳣������Ƶ����һ�飬����ֱ�Ӹ���try֮��������һ��catch֮��
 * finally����ȷ��ֻҪ�������е�try����У�
 * ��ô�����Ƿ��׳��쳣��finally�еĴ���ض�ִ��
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
