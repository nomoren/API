package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����ַ���
 * @author admin
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("С����ʦ");
		list.add("����");
		list.add("����ʦ");
		System.out.println(list);
		/*
		 * string�Ѿ�ʵ����comparable�ӿڣ��ȽϹ���Ϊ����ÿ���ַ���Unicode����Ƚ�
		 * ������������ʱ��ûʲô����
		 * �Դˣ���sort������ʹ����Ծ���
		 * ���Ե���
		 * �����Զ�������Ԫ�ػ���java�ṩ���Ѿ�ʵ��comparable�ӿڵ�Ԫ�أ�����
		 * �ȽϷ���������������������ʱ������Ӧ��ʹ�������sort����
		 */
		Collections.sort(list);
		System.out.println(list);
 	}
}
