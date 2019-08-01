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
			//1. 比较数据
			int val = e.compareTo(data);
			if(val==0) {
				//2. 如果一样返回 false
				return false;
			}else if(val<0) {
				//3. 如果小则向left添加
				if(left==null) {
					left = new Node(e);
					left.parent = this;
					return true;
				} else {
					return left.add(e);
				}
			}else {
				//4. 如果大则向right添加
				if(right==null) {
					right = new Node(e);
					right.parent=this;
					return true;
				}else {
					return right.add(e);
				}
			}
		}
		//Node 中序遍历
		public String toString() {
			//先输出左，再输出当前data，最后右
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





