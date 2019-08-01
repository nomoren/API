package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdk8以后集合和map都支持了一个新的方法：
 * foreach，可以使用lanbda遍历集合元素。
 * 由于该方法时集合自行提供的，那么在使用一个线程安全的集合或map时，该种遍历方式也是并发安全的
 * 原迭代器模式不与结婚方法互斥，并发需要自行维护
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
		map.put("上课", "笔记本");
		map.put("接萨芬", "跟");
		map.put("而非", "色额");
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}
}
