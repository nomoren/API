package String;
/**charAt(int index)
 * ��ȡ��ǰ�ַ�����ָ��λ�ö�Ӧ���ַ�
 * @author admin
 *
 */
public class CharDemo {
	public static void main(String[] args) {
	String str="�Ϻ�����ˮ���Ժ���";
	for(int i=0;i<str.length()/2;i++){
		char c1=str.charAt(i);
		char c2=str.charAt(str.length()-1-i);
		if(c1!=c2){
			System.out.println("��");
			break;
		}
	}
	System.out.println("�ǻ���");
}
}
