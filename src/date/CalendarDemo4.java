package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对指定的时间分量累加给定值，若给定的值时负数则是减去
 * 该操作与set不同，调用一次后就会真实进行一次计算
 * @author admin
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		//3年 5个月25天后
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 5);
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		/*
		 * 查看当周的周六是哪天
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(calendar.getTime());
	}
}
