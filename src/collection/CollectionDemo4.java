package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合当中的应用：约束集合中元素的类型
 * @author admin
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		for(String str:c){
			System.out.println(str);
		}
		/*
		 * 迭代器也支持泛型，指定的类型与集合的泛型一致即可
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
	}
}
