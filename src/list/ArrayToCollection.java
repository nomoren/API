package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转为list集合
 * 通过数组的工具类：arrays的静态方法aslist可以将一个数组转换为一个list
 * @author admin
 *
 */
public class ArrayToCollection {
	public static void main(String[] args) {
		String[] array={"one","two","three"};
		List<String> list=Arrays.asList(array);
		System.out.println(list);
		/*
		 * 数组转换的集合对其元素操作就是对原数组对应元素的操作
		 */
		list.set(1, "2");
		System.out.println(Arrays.toString(array));
		/*
		 * 由于数组是定长的，所以不支持集合的增删操作，下面的操作会抛出异常
		 */
		//list.add("four");
		//list.remove(1);
		
		/*
		 * 所有的集合都提供了一个参数为collection的构造方法，
		 * 作用是在创建当前集合的同时包含给定集合中的所有元素
		 */
		List<String> list2=new ArrayList<String>(list);
		list2.add("four");
		System.out.println(list2);
		
	}
}
