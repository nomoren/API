package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断map是否包含给定元素
 * 可以判断是否包含key和value
 * boolean containsKey(object k)
 * boolean containsValue(object v)
 * 
 * @author admin
 *
 */
public class Mapdemo3 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("化学", 95);
		map.put("物理", 98);
		boolean ck=map.containsKey("语文");
		boolean cv=map.containsValue(97);
	}
}
