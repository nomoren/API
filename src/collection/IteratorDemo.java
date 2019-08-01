package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合提供了统一的遍历元素方式：迭代器模式
 * 对应方法：
 * Iterator iterator()
 * 该方法可以获取一个用来遍历当前集合的迭代器实现类，通过他遍历元素
 * java.util.iterator接口
 * 迭代器接口，规定了迭代器遍历集合的相关操作，不同的集合都实现了一个
 * 用于遍历自身元素的迭代器实现类
 * 迭代器遍历集合元素遵循的过程：问，取。删
 * 其中删除元素不是必要操作
 * @author admin
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		
		//获取迭代器
		Iterator it=c.iterator();
		/*
		 * boolean hasNext()
		 * 判断集合是否还有元素可以迭代
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * 迭代集合下一个元素
			 */
			Object o=it.next();
			if("#".equals(o)){
				/*
				 * 删除的是通过next方法获取的元素
				 */
				it.remove();
			}
			System.out.println(o);
		}
		System.out.println(c);
	}
}
