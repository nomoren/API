package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.list接口
 * list继承自collection
 * list的特点：可重复，并且有序，提供了一组可以通过下标操作元素的方法
 * 常用实现类
 * java.util.arraylist:内部由数组实现，查询性能更好
 * java.util.linkedlist:内部由链表实现，增删元素性能更好，尤其首尾增删元素。
 * 在对性能没有特别苛刻要求下，通常使用的是arraylist即可
 * @author admin
 *
 */
public class GetSetDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取给定下标对应的元素
		 */
		String str=list.get(2);
		//list可以用普通for循环遍历
		for(int i=0;i<list.size();i++){
			String s=list.get(i);
			//System.out.println(s);
		}
		/*
		 * E set(int index,E e)
		 * 将原定元素设置到指定位置，返回值为原位置对应元素。所以set方法的意义是替换元素操作
		 */
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
		
	}
}








