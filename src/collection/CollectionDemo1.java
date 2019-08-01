package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * 集合
 * 集合与数组相似，可以保存一组元素，并且提供了操作集合元素的相关方法，使用便捷
 * collection接口下面有两个常用的子接口：
 * java.util.list 可重复集合，并且有序，可以通过下标操作元素
 * java.util.set  不可重复集合。元素是否重复是依靠元素自身equals比较进行判定的
 * @author admin
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * 向集合中添加给定元素，当该元素成功添加返回true
		 */
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size=c.size();
		System.out.println(size);
		/*
		 * boolean isEmpty()
		 * 
		 * 判断当前集合是否为空集
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println(isEmpty);
		/*
		 * void clear()
		 * 清空当前集合
		 * 
		 */
		c.clear();
		System.out.println(c);
	}
}
