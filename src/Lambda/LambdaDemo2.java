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
		list.add("����");
		list.add("С������");
		list.add("С");
		System.out.println(list);
		
		/*Comparator<String> com=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};*/
		
		/*Comparator<String> com=(o1,o2)->{
			return o1.length()-o2.length();
			�����еĲ������Բ���ָ�������������ϳ����Զ�������������
		};*/
		
		
		/*
		 * �������ֻ��һ����ô�ں���{}��ͬʱ��return�ؼ���ҲҪ����
		 */
		Comparator<String> com=(o1,o2)-> o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
 	}
}
