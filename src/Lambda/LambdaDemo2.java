package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author admin
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("创奇");
		list.add("小泽老鼠");
		list.add("小");
		System.out.println(list);
		
		/*Comparator<String> com=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};*/
		
		/*Comparator<String> com=(o1,o2)->{
			return o1.length()-o2.length();
			方法中的参数可以不再指定，编译器会结合程序自动分析参数类型
		};*/
		
		
		/*
		 * 如果代码只有一句那么在忽略{}的同时，return关键字也要忽略
		 */
		Comparator<String> com=(o1,o2)-> o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
 	}
}
