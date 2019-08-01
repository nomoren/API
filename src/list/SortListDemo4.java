package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * collections提供了一个可以重载的sort方法，该方法 除了要求传入要排序的集合外，
 * 还要求再传入一个比较器（comparator），该比较器可以定义一种比较规则，该sort方法
 * 会用这个比较规则对集合比较后排序
 * @author admin
 *
 */
public class SortListDemo4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("小泽老师");
		list.add("艺龙");
		list.add("传奇");
		
		list.add("仓老师");
		
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
	}
}
