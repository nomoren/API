package String;
/**
 * boolean startWith(string str)
 * boolean endWith(string str)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ���β��
 * 
 * @author admin
 *
 */
public class StartWithDemo {
	public static void main(String[] args) {
		String str="thinking in java";
		boolean starts=str.startsWith("th");
		System.out.println(starts);
		boolean end=str.endsWith("v");
		System.out.println(str.length());
	}
}
