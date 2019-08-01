package String;
/**charAt(int index)
 * 获取当前字符串中指定位置对应的字符
 * @author admin
 *
 */
public class CharDemo {
	public static void main(String[] args) {
	String str="上海自来水来自海上";
	for(int i=0;i<str.length()/2;i++){
		char c1=str.charAt(i);
		char c2=str.charAt(str.length()-1-i);
		if(c1!=c2){
			System.out.println("不");
			break;
		}
	}
	System.out.println("是回文");
}
}
