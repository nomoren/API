package list;

import java.util.ArrayList;
import java.util.List;

/**
 * list�ṩ��һ�����ص�add��remove����
 * @author admin
 *
 */
public class AddRemoveDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add(1, "2");
		String str1=new String("TEDU"); 
		String str2=new String("tedu"); 
		if(str1.equals(str2)){
			System.out.println("s");
		}
			
		/*
		 * void add(int index,E e)
		 * ������Ԫ�ز��뵽ָ��λ��
		 */
		System.out.println(list);
		/*
		 * E remove(int index)
		 * ɾ�������ظ���λ�ö�Ӧ��Ԫ��
		 */
		String old=list.remove(2);
		System.out.println(old);
		System.out.println(list);
		boolean ss=list.remove("five");
		System.out.println(list);
	}
}
