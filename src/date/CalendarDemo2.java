package date;

import java.util.Calendar;

/**
 * calendar�ṩ�˻�ȡʱ�������Ϣ�ķ�����
 * int get(int field)
 * ����Ϊһ��intֵ����ͬ��ֵ��ʾ��ͬ��ʱ��������������������Щ����
 * calendar����Щ������Ϊ�˳���
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
		 * ��ȡ��
		 * DAY_OF_MONTH ���е���
		 * DATE				   ���е���
		 * DAY_OF_WEEK	   ���е���
		 * DAT_OF_YEWR    ���е���
		 */
		int d=calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println(d);
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		String[] data={"��","һ","��","��","��","��","��"};
		int e=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(e);
		System.out.println("��"+data[e-1]);
		int day=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
