package Integer;
/**
 * 包装类都提供了一个静态方法
 * parsexxx(string str)
 * 可以将字符串解析为对应的基本类型，但是需要注意，该字符串能够正确描述该基本类型
 * 可以保存的值，否则会抛出异常
 * @author admin
 *
 */
public class ParseDemo {
		public static void main(String[] args) {
			String str="123";
			int t=Integer.parseInt(str);
			double b=Double.parseDouble(str);
			System.out.println(t);
			System.out.println(b);
		}

}
