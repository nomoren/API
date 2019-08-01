package text;
public class LinkText {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(88);
		list.add(55);
		list.add(33);
		list.add(66);
		list.add(77);
		list.add(5, 7);
		System.out.println(list.toString());
	}
}
