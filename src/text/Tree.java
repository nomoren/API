package text;

public class Tree<E extends Comparable<E>> { 
	private Node root;
	private class Node{
		E data;
		Node parent;
		Node left;
		Node right;
		public Node(E e) {
			data = e;
		}
		boolean add(E e) {
			//1. �Ƚ�����
			int val = e.compareTo(data);
			if(val==0) {
				//2. ���һ������ false
				return false;
			}else if(val<0) {
				//3. ���С����left���
				if(left==null) {
					left = new Node(e);
					left.parent = this;
					return true;
				} else {
					return left.add(e);
				}
			}else {
				//4. ���������right���
				if(right==null) {
					right = new Node(e);
					right.parent=this;
					return true;
				}else {
					return right.add(e);
				}
			}
		}
		//Node �������
		public String toString() {
			//��������������ǰdata�������
			StringBuilder buf=
					new StringBuilder();
			if(this.left!=null) {
				buf.append(left.toString());
			}
			buf.append(data).append(", ");
			if(right!=null) {
				buf.append(right.toString());
			}
			return buf.toString();
		}
	}
	public boolean add(E e) {
		if(root==null) {
			root=new Node(e);
			return true;
		}
		return root.add(e);
	}
	
	@Override
	public String toString() {
		if(root==null) {
			return "[]";
		}
		String str = root.toString();
		return "["+str.substring(0, 
				str.length()-2)+"]";
	}
}





