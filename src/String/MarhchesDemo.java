package String;
/**
 * string֧��������ʽ����֮һ��
 * boolean mathes��string reges��
 * �ø�����������ʽ��֤��ǰ�ַ����Ƿ�������ʽҪ��
 * @author admin
 *
 */
public class MarhchesDemo {
	public static void main(String[] args) {
		String email="A88888";
		String f="YUE"+"[A-Z]{1}+\\d{5,6}";
		/*
		 * \w+@\w+(\.[a-zA-Z]+)+
		 * matches����ָ����������ʽ���㲻ָ���߽�ƥ�����Ҳ������ȫƥ���
		 */
		String s="[A-Z]{1}+\\W+";
		boolean b=email.matches(f);
		if(b){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
