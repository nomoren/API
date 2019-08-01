package map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * map�ı���
 * 1.�������е�key
 *2.����ÿһ���ֵ��
 *3.�������е�value����Բ����ã�
 * @author admin
 *
 */
public class Mapdemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("��ѧ", 95);
		map.put("����", 98);
		/*
		 * �������е�key
		 * Set(key) keySet()
		 * ����ǰmap�����е�key��һ��set������ʽ���أ�����������Ͼ͵�ͬ�ڱ���������key
		 */
		/*Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println(key);
		}*/
		/*
		 * ����ÿһ���ֵ��
		 * Set<Entry> entryset();
		 * java.util.map.entry
		 * entry��ÿһ��ʵ�����ڱ�ʾ��ǰmap�еļ�ֵ�ԡ������������õķ�����
		 * getkey();getvaule();
		 * �ֱ����ڻ�ȡ��Ӧ��key��value
		 */
		Set<Entry<String, Integer>> s=map.entrySet();
		for(Entry<String, Integer> e:s){
			String a=e.getKey();
			Integer i=e.getValue();
			System.out.println(a+":"+i);
		}
		
		
		
		
		
	/*	Set<Entry<String,Integer>> entryset=map.entrySet();
		for(Entry<String,Integer> e:entryset){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		*/
		/*
		 * ��������value
		 */
		Collection<Integer> c=map.values();
		for(Integer value:c){
			System.out.println(value);
		}
 		
		
		
		
		
		
		
		
	}
}
