package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.calendar
 * 日历类，
 * calendar是用来操作时间的api，使用非常方便。提供了一个用于实现类的
 * 静态方法：getInstance（），该方法可以根据系统所在地区获取一个适用的实现类
 * 大部分地区获取回来的都是GregorianCalendar，即阳历
 * @author admin
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//calendar默认也表示当前系统时间
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		//calendar的tostring方法输出信息很多，但是不能直观看出具体日期
		/*
		 * date getTime（）
		 * calendar提供的gettime方法可以获取一个date，该实例表示
		 * 的就是calendar表示的日期
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * calendar的另一个方法:
		 * void setTime(Date date)
		 * 该方法可以让当期calendar表示给定date所表示的日期
		 */
	}
}
