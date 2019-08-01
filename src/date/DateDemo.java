package date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.date
 * date的每一个实例用于表示一个时间点
 * 内部维护一个long值，该值记录的时间自1970.01.01  00:00:00到当前date表示
 * 的时间之间所经过的毫秒
 * 由于date存在时区以及千年虫问题，所以大部分操作时间的方法都被声明为过时的不再建议使用了
 * @author admin
 *
 */
public class DateDemo {




	public static void main(String[] args) {
		//默认创建表示当期系统时间
		Date date=new Date();
		//System.out.println(date);
		///获取date内部维护的long值
		long time=date.getTime();
		//System.out.println(time);
		
		time=time+1000*60*60*24;
		date.setTime(time);
		System.out.println(date);
		
		date.setTime(0);
		//System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//String line=sdf.format(now);
		//System.out.println(line);
		
		
		
		
		
		
		
	}
}
