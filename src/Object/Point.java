package Object;
/**
 * 使用当前类测试重写object相关方法
 * @author admin
 *
 */
public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * tostring方法会被很多API调用。所以当我们定义一个类时，很常见的就是重写这个方法。
	 * 该方法的意义就是将当前对象转换为一个字符串形式，该字符串格式没有严格的要求。
	 * 原则为包含这个对象的相关属性信息
	 */
	public String toString(){
		return "( "+x+y+")";
	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}
