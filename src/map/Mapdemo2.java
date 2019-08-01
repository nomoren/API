package map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * map的遍历
 * 1.遍历所有的key
 *2.遍历每一组键值对
 *3.遍历所有的value（相对不常用）
 * @author admin
 *
 */
public class Mapdemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("化学", 95);
		map.put("物理", 98);
		/*
		 * 遍历所有的key
		 * Set(key) keySet()
		 * 将当前map中所有的key以一个set集合形式返回，遍历这个集合就等同于遍历了所有key
		 */
		/*Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println(key);
		}*/
		/*
		 * 遍历每一组键值对
		 * Set<Entry> entryset();
		 * java.util.map.entry
		 * entry的每一个实例用于表示当前map中的键值对。其中两个常用的方法：
		 * getkey();getvaule();
		 * 分别用于获取对应的key和value
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
		 * 遍历所有value
		 */
		Collection<Integer> c=map.values();
		for(Integer value:c){
			System.out.println(value);
		}
 		
		
		
		
		
		
		
		
	}
}
