package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ��ָ��ʱ������趨ָ����ֵ
 * @author admin
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		/*
		 *��ʾ2008-08-08 20:08:08
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
		 * ����������8�ţ�����set����������ÿ�����ú����Ľ�ʱ�������ɶ�Ӧֵ��
		 * ������getTimeʱ����ʵ�ʼ��㣬��������Ĵ������������ڼ�ʱ��Ӱ�����е��죬
		 * ��ᵼ�����õ�8�ű����ǣ�����û��
		 * �Դ˵Ľ�������ǣ������ó����໥Ӱ��ʱ��������֮ǰ���ù�����������һ��
		 * getTime������calendar����һ�ε�������������þ�û��������
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(calendar.getTime());
	}
}
