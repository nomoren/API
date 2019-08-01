package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 * @author admin
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(3, 4));
		list.add(new Point(4,9));
		list.add(new Point(2,7));
		list.add(new Point(8,1));
		list.add(new Point(6,0));
		list.add(new Point(4, 4));
		Collections.sort(list);
		System.out.println(list);
		
		/*
		 * collections的sort方法排序的集合要求元素必须实现comparable接口
		 * 如果排序自定义类型元素，强烈建议不使用这种方式。因为这个sort方法对
		 * 我们的代码有侵入性（他要求point必须为他实现接口，并重写方法），由于java api中
		 * 很多类已经实现该接口，比如包装类，string类等，那么在排序这样的元素的集合时可以
		 * 直接使用sort
		 */
	}
}
