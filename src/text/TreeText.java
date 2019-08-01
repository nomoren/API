package text;

public class TreeText {
	public static void main(String[] args) {
		Tree<Integer> tree=new Tree<Integer>();
		tree.add(88);
		tree.add(86);
		tree.add(120);
		System.out.println(tree.toString());
	}
}
