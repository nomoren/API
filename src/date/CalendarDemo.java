package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.calendar
 * �����࣬
 * calendar����������ʱ���api��ʹ�÷ǳ����㡣�ṩ��һ������ʵ�����
 * ��̬������getInstance�������÷������Ը���ϵͳ���ڵ�����ȡһ�����õ�ʵ����
 * �󲿷ֵ�����ȡ�����Ķ���GregorianCalendar��������
 * @author admin
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//calendarĬ��Ҳ��ʾ��ǰϵͳʱ��
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		//calendar��tostring���������Ϣ�ܶ࣬���ǲ���ֱ�ۿ�����������
		/*
		 * date getTime����
		 * calendar�ṩ��gettime�������Ի�ȡһ��date����ʵ����ʾ
		 * �ľ���calendar��ʾ������
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * calendar����һ������:
		 * void setTime(Date date)
		 * �÷��������õ���calendar��ʾ����date����ʾ������
		 */
	}
}
