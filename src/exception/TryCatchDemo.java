package exception;
/**
 * java�쳣��������е�try-catch
 * try���������������ܳ���Ĵ���Ƭ�Σ�catch����������Щ�������
 * �ô�����д���
 * 
		 * ��jvmִ�д���ʱ����һ������ʱ������ݴ���ʵ������Ӧ���쳣ʵ����
		 * ��������ִ�й������ý�ȥ��Ȼ�󽫸��쳣�����λ���׳�
		 * ֮��jvm�����׳����쳣�Ƿ��б�try-catch������û������Ϊ��������
		 * ���ڷ���û�н���쳣����������֮���쳣�׳����÷���֮��
		 
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
			System.out.println("�����±�Խ���쳣");
		}catch(Exception e){
			System.out.println("����δ֪����");
		}
		System.out.println("end");
	}
}
