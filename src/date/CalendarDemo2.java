package date;

import java.util.Calendar;

/**
 * calendar提供了获取时间分量信息的方法：
 * int get(int field)
 * 参数为一个int值，不同的值表示不同的时间分量，我们无需记忆这些数字
 * calendar吧这些数定义为了常量
 * @author admin
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int date=calendar.get(Calendar.DATE);
		System.out.println(year+":"+month+":"+date);
		/*
		 * 获取日
		 * DAY_OF_MONTH 月中的天
		 * DATE				   月中的天
		 * DAY_OF_WEEK	   周中的天
		 * DAT_OF_YEWR    年中的天
		 */
		int d=calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println(d);
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		String[] data={"日","一","二","三","四","五","六"};
		int e=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(e);
		System.out.println("周"+data[e-1]);
		int day=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
