package list;
/**
 * ʹ�õ�ǰ��ʵ����Ϊ����Ԫ�أ����Լ�����ز���
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
	 * ��һ����ʵ����comparable�ӿں������дcompareTo����
	 * �÷����������ǱȽϵ�ǰ����this�뷽���Ĳ�������o֮��Ĵ�С
	 * ����ֵ�����ľ���ȡֵ��ֻ����ȡֵ��Χ
	 * return>0;��ǰ������ڲ�������
	 * return<0;��ǰ����С�ڲ�������
	 * return=0;��ǰ������ڲ�������
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
