package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.map
 * 
 * map
 * ���ұ��ṹ����������һ���������еı�����г�Ϊkey�����г�Ϊvalue
 * ����map������key-value����ʽ����Ԫ�ء��������Ǹ���keyȡ��ȡ��Ӧ��valueֵ
 * �Դ����Ǿ���������ѯ����"��Ϊkey����Ҫ��ѯ��������Ϊvalue���б���
 * map������һ���ӿڣ�����map��������ط�����
 * ����ʵ���ࣺjava.util.HashMap
 * hashmap�ֳ�Ϊɢ�б�
 * ʹ��ɢ���㷨ʵ�ֵ�map�����������ϲ�ѯ�ٶ��������ݽṹ��
 * @author admin
 *
 */
public class Mapdemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		/*
		 * V put(K k, V v)
		 * 
		 * map��һ��Ҫ�󣬼���key�������ظ����Ƿ��ظ����������equels�ȽϵĽ��
		 * ���ʹ��map�����е�key����value����ô��ʱput�����Ὣ���滻 ��value���أ�
		 * ���򷵻�ֵΪnull  
		 */
		/*
		 * ���value��һ����װ�࣬��ô����ʱӦ������ֱ���û������ͣ���Ϊ��ᵼ��
		 * �Զ����䣬��û�����滻���������ص�valueΪnullʱ�������˿�ָ���쳣
		 */
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("��ѧ", 95);
		map.put("����", 98);
		//Integer a =map.put("����", 97);
		
		Integer a=map.get("��ѧ");//��������key�����ڣ��򷵻�null
		
		a=map.remove("��ѧ");//��������key����Ӧ�ļ�ֵ��ɾ��������ֵΪ��key��Ӧ��valueֵ
		System.out.println(map);
	
		
	}
}
