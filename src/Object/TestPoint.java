package Object;
/**
 * ����point��д��object��ط���
 * @author admin
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p=new Point(1, 2);
		/*String str=p.toString();
		System.out.println(str);*/
		System.out.println(p);
		Point p2=new Point(1, 2);
		System.out.println(p.equals(p2));
	}
}
