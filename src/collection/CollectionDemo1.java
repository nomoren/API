package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * ����
 * �������������ƣ����Ա���һ��Ԫ�أ������ṩ�˲�������Ԫ�ص���ط�����ʹ�ñ��
 * collection�ӿ��������������õ��ӽӿڣ�
 * java.util.list ���ظ����ϣ��������򣬿���ͨ���±����Ԫ��
 * java.util.set  �����ظ����ϡ�Ԫ���Ƿ��ظ�������Ԫ������equals�ȽϽ����ж���
 * @author admin
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * �򼯺�����Ӹ���Ԫ�أ�����Ԫ�سɹ���ӷ���true
		 */
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		int size=c.size();
		System.out.println(size);
		/*
		 * boolean isEmpty()
		 * 
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ�
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println(isEmpty);
		/*
		 * void clear()
		 * ��յ�ǰ����
		 * 
		 */
		c.clear();
		System.out.println(c);
	}
}
