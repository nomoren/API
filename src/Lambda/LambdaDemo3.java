package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdk8�Ժ󼯺Ϻ�map��֧����һ���µķ�����
 * foreach������ʹ��lanbda��������Ԫ�ء�
 * ���ڸ÷���ʱ���������ṩ�ģ���ô��ʹ��һ���̰߳�ȫ�ļ��ϻ�mapʱ�����ֱ�����ʽҲ�ǲ�����ȫ��
 * ԭ������ģʽ�����鷽�����⣬������Ҫ����ά��
 * @author admin
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		list.forEach((str)->{
			System.out.println(str);
		});
		Map<String, String> map=new HashMap<String,String>();
		map.put("�Ͽ�", "�ʼǱ�");
		map.put("������", "��");
		map.put("����", "ɫ��");
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}
}
