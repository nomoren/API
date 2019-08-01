package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 集合有线程安全的实现。我们可以借助collections将现有的集合转换为一个线程安全的
 * @author admin
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		/*
		 * list中常用的实现类，arraylist，linkedlist它们都不是线程安全的
		 */
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		/*
		 * 将给定的集合转换为一个线程安全的
		 */
		list=Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 * hashset同样也不是线程安全的
		 */
		Set<String> set=new HashSet<String>();
		set=Collections.synchronizedSet(set);
		/*
		 * 文档上有说明一个事情：
		 * 即使是一个线程安全的集合，他也不同迭代器遍历做互斥，所以这个操作要自行维护
		 */
		/*
		 * 队列也有并发安全的实现
		 * 阻塞队列
		 * BlockingQueue，BlockingDequ
		 * 阻塞队列内部使用双缓冲实现，在保证并发安全的前提下解决了存取互斥问题
		 * 所以并发效率更好
		 */
		BlockingQueue<String> queue=new LinkedBlockingQueue<String>();
		queue.offer("one");
		try {
			queue.offer("two", 500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
