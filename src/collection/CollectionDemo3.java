package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		System.out.println("c1"+c1);
		
		Collection c2=new  HashSet();
		c2.add("php");
		c2.add(".net");
		c2.add("java");
		System.out.println("c2"+c2);
		/*
		 * boolean addAll(collection c)
		 * �����������е�����Ԫ����ӵ���ǰ������
		 */
		c2.addAll(c1);
		System.out.println("c2"+c2);
		
		Collection c3=new ArrayList();
		c3.add("c");
		c3.add(".net");
		//c3.add("android");
		System.out.println("c3"+c3);
		/*
		 * containsAll��collettion c��
		 * �жϵ�ǰ�����Ƿ������������
		 */
		boolean ca=c2.containsAll(c3);
		System.out.println("ȫ����"+ca);
		
		/*
		 * ɾ����ǰ������������ϵĹ���Ԫ��
		 */
		c2.removeAll(c3);
		System.out.println(c2);
	}
}
