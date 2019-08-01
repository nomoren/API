package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集操作
 * List subList(int start,int end)
 * 获取当前集合指定下标到对应范围内的元素
 * @author admin
 *
 */
public class SublistDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		List<Integer> sublist=list.subList(3, 8);
		System.out.println(sublist);
		for(int i=0;i<sublist.size();i++){
			sublist.set(i, sublist.get(i)*10);
		}
		/*
		 * 操作子集就是对原集合对应元素的操作
		 */
		System.out.println(sublist);
		System.out.println(list);
		/*
		 * 将list集合中2-8删除
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
		//System.out.println(sublist);
	}
}
