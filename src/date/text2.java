package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class text2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("输入生产日期");
		Scanner sc =new Scanner(System.in);
		String line=sc.nextLine();
		System.out.println("保质期");
		int day=Integer.parseInt(sc.nextLine());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(line);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		date=calendar.getTime();
		String linee=sdf.format(date);
		System.out.println(linee);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String[] data=line.split("-");
		int time=Integer.parseInt(sc.nextLine());
		int year=Integer.parseInt(data[0]);
		int month=Integer.parseInt(data[1]);
		int day=Integer.parseInt(data[2]);
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DATE, day);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_YEAR, time);
		System.out.println("过期日："+calendar.getTime());
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.getTime();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println("打折日："+calendar.getTime());*/
	}
}
