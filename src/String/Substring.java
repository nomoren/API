package String;
/**
 * String substring(inde start,int end)
 * ��ȡָ����Χ�ڵ��ַ�������������Ϊ��ʼ���������±�
 * ע��Java api��һ���ص㣬ͨ���������ֱ�ʾ��Χʱ���ǡ���ͷ����β�ġ�
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

