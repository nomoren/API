package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����תΪlist����
 * ͨ������Ĺ����ࣺarrays�ľ�̬����aslist���Խ�һ������ת��Ϊһ��list
 * @author admin
 *
 */
public class ArrayToCollection {
	public static void main(String[] args) {
		String[] array={"one","two","three"};
		List<String> list=Arrays.asList(array);
		System.out.println(list);
		/*
		 * ����ת���ļ��϶���Ԫ�ز������Ƕ�ԭ�����ӦԪ�صĲ���
		 */
		list.set(1, "2");
		System.out.println(Arrays.toString(array));
		/*
		 * ���������Ƕ����ģ����Բ�֧�ּ��ϵ���ɾ����������Ĳ������׳��쳣
		 */
		//list.add("four");
		//list.remove(1);
		
		/*
		 * ���еļ��϶��ṩ��һ������Ϊcollection�Ĺ��췽����
		 * �������ڴ�����ǰ���ϵ�ͬʱ�������������е�����Ԫ��
		 */
		List<String> list2=new ArrayList<String>(list);
		list2.add("four");
		System.out.println(list2);
		
	}
}
