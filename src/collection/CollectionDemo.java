package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �����ṩ���ж��Ƿ��������Ԫ�صķ�����
 * boolean contatins(E e)
 * @author admin
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,0));
		/*
		 * ���ϵ�tostring�����Ὣÿ��Ԫ�ص�tostring���ֳ���
		 */
		System.out.println(c);
		Point p=new Point(1, 2);
		/*
		 * contains����ʱ��������equals�ȽϵĽ���жϼ����Ƿ����Ԫ��
		 */
		boolean contains=c.contains(p);
		System.out.println(contains);
	}
}
