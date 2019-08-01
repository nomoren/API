package collection;
/**
 * 泛型
 * 泛型是JDK5推出的特性，也称为参数化类型
 * 他允许将一个类中属性的类型，方法参数的类型以及方法返回值得类型等的定义
 * 交给使用者。这使得实际应用这个类更加灵活便捷
 */
public class Location<E>{
	private E x;
	private E y;
	public Location(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	
	public String toString() {
		
		return"("+x+","+y+")";
	}

}
