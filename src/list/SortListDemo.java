package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���Ϲ����ࣺjava.util.collections
 * ���ṩ��һ����̬������sort�����Զ�list���Ͻ�����Ȼ���򣬴�С����
 * @author admin
 *
 */
public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int  i=0;i<10;i++){
			list.add(r.nextInt(100));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
