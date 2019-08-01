package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.map
 * 
 * map
 * 查找表。结构看起来像是一个多行两列的表格，左列称为key，右列称为value
 * 所以map总是以key-value的形式保存元素。并且总是根据key取获取对应的value值
 * 对此我们经常将”查询条件"作为key，将要查询的数据作为value进行保存
 * map本身是一个接口，绑定了map操作的相关方法。
 * 常用实现类：java.util.HashMap
 * hashmap又称为散列表
 * 使用散列算法实现的map，当今世界上查询速度最快的数据结构。
 * @author admin
 *
 */
public class Mapdemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		/*
		 * V put(K k, V v)
		 * 
		 * map有一个要求，即：key不允许重复，是否重复依靠自身的equels比较的结果
		 * 如果使用map中已有的key保存value，那么这时put方法会将被替换 的value返回，
		 * 否则返回值为null  
		 */
		/*
		 * 如果value是一个包装类，那么接收时应当避免直接用基本类型，因为这会导致
		 * 自动拆箱，若没有做替换操作，返回的value为null时就引发了空指针异常
		 */
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("化学", 95);
		map.put("物理", 98);
		//Integer a =map.put("物理", 97);
		
		Integer a=map.get("数学");//若给定的key不存在，则返回null
		
		a=map.remove("数学");//将给定的key所对应的键值对删除，返回值为该key对应的value值
		System.out.println(map);
	
		
	}
}
