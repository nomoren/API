package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * ��ָ����ʱ������ۼӸ���ֵ����������ֵʱ�������Ǽ�ȥ
 * �ò�����set��ͬ������һ�κ�ͻ���ʵ����һ�μ���
 * @author admin
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		//3�� 5����25���
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 5);
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		/*
		 * �鿴���ܵ�����������
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(calendar.getTime());
	}
}
