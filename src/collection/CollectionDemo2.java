package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ֻ�ܴ����������Ԫ�أ����Ҵ�ŵ�Ҳ��Ԫ�ص����ã���ַ��
 * @author admin
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		System.out.println("����,,,����,,����,,,,,,����,,".split("[,]+").length );
		
		Collection c=new ArrayList();
		Point p=new Point(1, 2);
		c.add(p);
		System.out.println(c);
		System.out.println(p);
		p.setX(2);
		System.out.println(c );
		System.out.println(p);
	}
}
