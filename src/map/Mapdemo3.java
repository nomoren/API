package map;

import java.util.HashMap;
import java.util.Map;

/**
 * �ж�map�Ƿ��������Ԫ��
 * �����ж��Ƿ����key��value
 * boolean containsKey(object k)
 * boolean containsValue(object v)
 * 
 * @author admin
 *
 */
public class Mapdemo3 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("��ѧ", 95);
		map.put("����", 98);
		boolean ck=map.containsKey("����");
		boolean cv=map.containsValue(97);
	}
}
