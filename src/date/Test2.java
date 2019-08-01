package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ������:
 * ����һ����Ʒ����������,��ʽ(yyyy-MM-dd)
 * �����뱣���ڵ�������
 * Ȼ�󾭹����������������Ʒ�������ڣ���ʽ
 * Ҳ��:yyyy-MM-dd
 * �����ռ������:��Ʒ������ǰ���ܵ�����
 * @author ta
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String dateStr = scanner.nextLine();
		
		System.out.println("�����뱣����:");
		int days = Integer.parseInt(scanner.nextLine());
		
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//���������
		//1���������
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//2ǰ����
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//3����Ϊ���ܵ�����
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		date = calendar.getTime();
		String line = sdf.format(date);
		System.out.println("������Ϊ:"+line);
		
	}
}










