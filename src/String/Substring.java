package String;
/**
 * String substring(inde start,int end)
 * 截取指定范围内的字符串。两个参数为开始到结束的下标
 * 注：Java api有一个特点，通常两个数字表示范围时都是“含头不含尾的”
 * @author admin
 *
 */
public class Substring {
public static void main(String[] args) {
	String url="http//:www.baidu.com.cn";
	String name=getHostName(url);
	System.out.println(name);
	}
public static String getHostName(String url){
	int index=url.indexOf(".");
	int index1=url.indexOf(".",index+1);
	url=url.substring(index+1, index1);
	
	return url;
}
}

