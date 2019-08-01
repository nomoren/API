package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合工具类：java.util.collections
 * 其提供了一个静态方法：sort，可以对list集合进行自然排序，从小到大
 * @author admin
 *
 */
public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int  i=0;i<10;i++){
			list.add(r.nextInt(100));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
