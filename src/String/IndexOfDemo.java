package String;

public class IndexOfDemo {
public static void main(String[] args) {
	String str="thinking in java";
	int index=str.indexOf("i");
	System.out.println(index);
	//指定位置开始查找
	index=str.indexOf("i", 2);
	System.out.println(index);
	//查找最后一次出现的位置
	index=str.lastIndexOf("in");
	System.out.println(index);
}
}
