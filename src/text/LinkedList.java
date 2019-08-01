package text;

public class LinkedList<E> {
	private Node head;
	private int size;
	private class Node{
		E data;
		Node next;
		Node prev;
		Node(E e){
			data=e;
		}
	}
	public boolean add(E e){
		if(head==null){
			head=new Node(e);
			head.next=head;
			head.prev=head;
		}else{
			Node node=new Node(e);
			Node last=head.prev;
			head.prev=node;
			node.prev=last;
			last.next=node;
			node.next=head;
		}
		size++;
		return true;
	}
	public boolean add(int index,E e){
		if(index<0||index>size){
			throw new IndexOutOfBoundsException("越界:"+index);
		}
		if(index==size){
			add(e);//追加
		}
		//找到插入位置
		Node next=head;
		for(int i=0;i<index;i++){
			next=next.next;
		}
		Node prev=next.prev;
		//插入节点
		Node node=new Node(e);
		prev.next=node;
		node.next=next;
		next.prev=node;
		node.prev=prev;
		size ++;
		return true;
	}
	public String toString(){
		if(head==null){
			return "[]";
		}
		StringBuffer sb=new StringBuffer().append("[").append(head.data);
		Node node=head.next;
		while(node!=head){
			sb.append(",").append(node.data);
			node=node.next;
		}
		return sb.append("]").toString();
	}
}
