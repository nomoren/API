package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author admin
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(3, 4));
		list.add(new Point(4,9));
		list.add(new Point(2,7));
		list.add(new Point(8,1));
		list.add(new Point(6,0));
		list.add(new Point(4, 4));
		Collections.sort(list);
		System.out.println(list);
		
		/*
		 * collections��sort��������ļ���Ҫ��Ԫ�ر���ʵ��comparable�ӿ�
		 * ��������Զ�������Ԫ�أ�ǿ�ҽ��鲻ʹ�����ַ�ʽ����Ϊ���sort������
		 * ���ǵĴ����������ԣ���Ҫ��point����Ϊ��ʵ�ֽӿڣ�����д������������java api��
		 * �ܶ����Ѿ�ʵ�ָýӿڣ������װ�࣬string��ȣ���ô������������Ԫ�صļ���ʱ����
		 * ֱ��ʹ��sort
		 */
	}
}
