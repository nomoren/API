package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只能存放引用类型元素，并且存放的也是元素的引用（地址）
 * @author admin
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		System.out.println("张三,,,李四,,王五,,,,,,马六,,".split("[,]+").length );
		
		Collection c=new ArrayList();
		Point p=new Point(1, 2);
		c.add(p);
		System.out.println(c);
		System.out.println(p);
		p.setX(2);
		System.out.println(c );
		System.out.println(p);
	}
}
