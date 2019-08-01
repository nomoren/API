package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转为数组
 * 集合提供了一个方法:toarray 可以将当前集合转换为一个数组
 * @author admin
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		String[] array=c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(array));
	}
}
