package String;
/**
 * boolean startWith(string str)
 * boolean endWith(string str)
 * 判断当前字符串是否是以给定的字符串开始或结尾的
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
