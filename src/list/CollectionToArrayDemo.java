package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����תΪ����
 * �����ṩ��һ������:toarray ���Խ���ǰ����ת��Ϊһ������
 * @author admin
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		String[] array=c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(array));
	}
}
