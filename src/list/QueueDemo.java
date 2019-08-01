package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.queue
 * queue继承自collection
 * 队列也可以保存一组元素，但是存取元素必须遵循先进先出模式
 * 常用实现类：linkedlist
 * @author admin
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/*
		 * offer时入队操作，向队列末尾追加元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * poll方法是出对操作，获取首元素后该元素即从队列中被删除
		 */
		String str=queue.poll();
		System.out.println(queue);
		System.out.println(str);
		/*
		 * peek是引用队首元素，元素不做出对操作
		 */
		str=queue.peek();
		System.out.println(str+queue);
		/*
		 * 使用迭代器遍历，元素不会从队列中删除
		 */
		/*for(String s:queue){
			System.out.println(s);
		}*/
		
		/*
		 * 使用poll方法遍历
		 */
		for(int i=queue.size();i>0;i--){
			String s=queue.poll();
			System.out.println(s);
		}
	}
}
