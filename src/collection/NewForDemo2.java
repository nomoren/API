package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ʹ����ѭ����������
 * @author admin
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		c.add("five");
		/*
		 * ��ѭ���������ϻᱻ��������Ϊʹ�õ����������������ڱ�����ʱ���ǲ���
		 * ͨ�����ϵķ�����ɾԪ�ص�
		 */
		for(Object d:c){
			String s=(String)d;
			System.out.println(s);
		}
	}
}
