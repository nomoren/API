package String;
/**
 * string支持正则表达式方法之一：
 * boolean mathes（string reges）
 * 用给定的正则表达式验证当前字符串是否符合其格式要求
 * @author admin
 *
 */
public class MarhchesDemo {
	public static void main(String[] args) {
		String email="A88888";
		String f="YUE"+"[A-Z]{1}+\\d{5,6}";
		/*
		 * \w+@\w+(\.[a-zA-Z]+)+
		 * matches方法指定的正则表达式就算不指定边界匹配符，也是做完全匹配的
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
