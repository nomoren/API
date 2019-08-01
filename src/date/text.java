package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class text {
	public static void main(String[] args) throws ParseException {
		System.out.println(" ‰»Î…˙»’£∫");
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		Date date=sdf.parse(line);
		long t=date.getTime();
		
		Date date1=new Date();
		long t1=date1.getTime();
		
		long day=  (t1-t)/(24*60*60*1000l);
		System.out.println(day);
		
		long time=t+24*60*60*1000L*10000;
		date.setTime(time);
		String ste=sdf.format(date);
		System.out.println(ste);
	}
}
