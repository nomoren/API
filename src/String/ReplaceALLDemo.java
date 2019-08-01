package String;
/**
 * string replaceALL(string regrx,string str)
 * 将当前字符串中符合正则表达式要求的部分替换为给定的内容
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
