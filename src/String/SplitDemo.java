package String;

import java.util.Arrays;

/**spring[] split(string str)
 * 使用给定的正则表达式来拆分当前字符串，并将拆分后的字符串以数组形式返回
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
