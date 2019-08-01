package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除元素集合
 * @author admin
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(1, 2));
		c.add(new Point(7, 8));
		System.out.println(c);
		Point p=new Point(1, 2);
		/*
		 * 删除元素依靠equels比较
		 */
		c.remove(p);
		System.out.println(c);
	}
}
