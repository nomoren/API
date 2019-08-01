package list;
/**
 * 使用当前类实例作为集合元素，测试集合相关操作
 * @author admin
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public String i=".";
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
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
	
	public String toString(){
		return "("+x+","+y+")";
		
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
	/**
	 * 当一个类实现了comparable接口后必须重写compareTo方法
	 * 该方法的作用是比较当前对象this与方法的参数对象o之间的大小
	 * 返回值不关心具体取值，只关心取值范围
	 * return>0;当前对象大于参数对象
	 * return<0;当前对象小于参数对象
	 * return=0;当前对象等于参数对象
	 */
	public int compareTo(Point o) {
		int len=this.x*this.x+this.y*this.y;
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
		 
	}
	public static void main(String[] args) {
		String s="ax.cd.s";
		Point p=new Point(1, 2);
		
		s.split(p.i);
		
		
		
		
	}
}
