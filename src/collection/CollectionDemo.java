package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合提供了判断是否包含给定元素的方法：
 * boolean contatins(E e)
 * @author admin
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		/*
		 * 集合的tostring方法会将每个元素的tostring体现出来
		 */
		System.out.println(c);
		Point p=new Point(1, 2);
		/*
		 * contains方法时依靠自身equals比较的结果判断集合是否包含元素
		 */
		boolean contains=c.contains(p);
		System.out.println(contains);
	}
}
