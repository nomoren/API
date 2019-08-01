package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * collections�ṩ��һ���������ص�sort�������÷��� ����Ҫ����Ҫ����ļ����⣬
 * ��Ҫ���ٴ���һ���Ƚ�����comparator�����ñȽ������Զ���һ�ֱȽϹ��򣬸�sort����
 * ��������ȽϹ���Լ��ϱȽϺ�����
 * @author admin
 *
 */
public class SortListDemo4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("С����ʦ");
		list.add("����");
		list.add("����");
		
		list.add("����ʦ");
		
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
	}
}
