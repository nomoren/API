package String;
/**
 * string replaceALL(string regrx,string str)
 * ����ǰ�ַ����з���������ʽҪ��Ĳ����滻Ϊ����������
 * @author admin
 *
 */
public class ReplaceALLDemo {
	public static void main(String[] args) {
		String str="abc123sdf456sffd154fas";
		/*String regex="[a-z]+";*/
		/*str=str.replaceAll(regex, "#");*/
		str=str.replace("abc", "v");
		System.out.println(str);
	}
}
