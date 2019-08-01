package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author admin
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		c.add("five");
		/*
		 * 新循环遍历集合会被编译器改为使用迭代器遍历。所以在遍历的时候是不能
		 * 通过集合的方法增删元素的
		 */
		for(Object d:c){
			String s=(String)d;
			System.out.println(s);
		}
	}
}
