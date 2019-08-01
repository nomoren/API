package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 * @author admin
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("小泽老师");
		list.add("传奇");
		list.add("仓老师");
		System.out.println(list);
		/*
		 * string已经实现了comparable接口，比较规则为按照每个字符的Unicode编码比较
		 * 对于排序中文时，没什么意义
		 * 对此，该sort方法的使用相对局限
		 * 所以当：
		 * 排序自定义类型元素或者java提供的已经实现comparable接口的元素，但是
		 * 比较方法不满足我们排序需求时。都不应当使用下面的sort方法
		 */
		Collections.sort(list);
		System.out.println(list);
 	}
}
