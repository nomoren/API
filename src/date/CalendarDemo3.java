package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 对指定时间分量设定指定的值
 * @author admin
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		/*
		 *表示2008-08-08 20:08:08
		 */
		Calendar calendar=Calendar.getInstance();
		calendar.set(calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DATE, 8);
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		/*
		 * 上面日期是8号，但是set方法并非在每次设置后就真的将时间分量变成对应值，
		 * 而是在getTime时进行实际计算，但是下面的代码在设置星期几时会影响月中的天，
		 * 这会导致设置的8号被覆盖，等于没做
		 * 对此的解决方法是：当设置出现相互影响时，可以在之前设置过后主动调用一次
		 * getTime方法让calendar进行一次调整运算后再设置就没有问题了
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(calendar.getTime());
	}
}
