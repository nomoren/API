package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.list�ӿ�
 * list�̳���collection
 * list���ص㣺���ظ������������ṩ��һ�����ͨ���±����Ԫ�صķ���
 * ����ʵ����
 * java.util.arraylist:�ڲ�������ʵ�֣���ѯ���ܸ���
 * java.util.linkedlist:�ڲ�������ʵ�֣���ɾԪ�����ܸ��ã�������β��ɾԪ�ء�
 * �ڶ�����û���ر����Ҫ���£�ͨ��ʹ�õ���arraylist����
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
		 * ��ȡ�����±��Ӧ��Ԫ��
		 */
		String str=list.get(2);
		//list��������ͨforѭ������
		for(int i=0;i<list.size();i++){
			String s=list.get(i);
			//System.out.println(s);
		}
		/*
		 * E set(int index,E e)
		 * ��ԭ��Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�ӦԪ�ء�����set�������������滻Ԫ�ز���
		 */
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println(old);
		
	}
}








