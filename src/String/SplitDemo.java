package String;

import java.util.Arrays;

/**spring[] split(string str)
 * ʹ�ø�����������ʽ����ֵ�ǰ�ַ�����������ֺ���ַ�����������ʽ����
 * @author admin
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str="abc123sdf456sffd154fas";
		String regex="[0-9]+";
		String[] array=str.split(regex);
		System.out.println(Arrays.toString(array));
	}
}
