package list;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ�Ӽ�����
 * List subList(int start,int end)
 * ��ȡ��ǰ����ָ���±굽��Ӧ��Χ�ڵ�Ԫ��
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
		 * �����Ӽ����Ƕ�ԭ���϶�ӦԪ�صĲ���
		 */
		System.out.println(sublist);
		System.out.println(list);
		/*
		 * ��list������2-8ɾ��
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
		//System.out.println(sublist);
	}
}
