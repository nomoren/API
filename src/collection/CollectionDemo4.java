package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ��ϵ��е�Ӧ�ã�Լ��������Ԫ�ص�����
 * @author admin
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		for(String str:c){
			System.out.println(str);
		}
		/*
		 * ������Ҳ֧�ַ��ͣ�ָ���������뼯�ϵķ���һ�¼���
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
	}
}
