package collection;
/**
 * ≤‚ ‘∑∫–Õ
 * @author admin
 *
 */
public class TypeDemo {
	public static void main(String[] args) {
		Location<Integer> loc1=new Location<Integer>(1, 2);
		loc1.setX(2);
		System.out.println(loc1);
		Location<Double> loc2=new Location<Double>(2.2, 2.1);
		loc2.setX(2.3);
		System.out.println(loc2);
		Location<String> loc3=new Location<String>("hfdu", "fba");
		System.out.println(loc3);
	}
}
