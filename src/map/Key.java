package map;
/**
 * hashmap是查询速度最快的数据结构，内部使用数组实现，他通过key的hashcode值计算
 * 该元素在数组中的下标位置，从而避免了遍历元素的操作，不受元素的数量影响
 * 
 * 由于key的hashcode方法（决定其在hashmap内部数组的位置）和equles方法（决定key是否重复）
 * 直接影响hashmap是否会出现链表，对此两个方法在object类中有明确的重写说明
 * 
 * 当一个hashmap内部出现链表时，会减低其查询性能，应当尽量避免。而出现链表的情况在于：
 * 当两个key的hashcode值相同，e而equals比较不为true时就会形成
 * 
 * API手册中在object类中说明了这两个方法的重写规则：
 * 1.成对重写
 * 		当我们需要重写一个equals方法时，就应当连同hashcode一起重写
 * 2.一致性
 * 		当两个对象的equals比较为true时，hashcode方法返回的数字必须相同，反之则不是必须的，但是
 * 应当尽量保证两个对象hashcode值相同时equals方法比较为true，否则在hashmap中作为key时会出现链表
 * 3.稳定性：当一个对象参与equals比较的属性值没有发生改变的前提下，多次调用hashcode方法返回的数字
 * 应当相同
 * @author admin
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
