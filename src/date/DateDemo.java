package date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.date
 * date��ÿһ��ʵ�����ڱ�ʾһ��ʱ���
 * �ڲ�ά��һ��longֵ����ֵ��¼��ʱ����1970.01.01  00:00:00����ǰdate��ʾ
 * ��ʱ��֮���������ĺ���
 * ����date����ʱ���Լ�ǧ������⣬���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ�Ĳ��ٽ���ʹ����
 * @author admin
 *
 */
public class DateDemo {




	public static void main(String[] args) {
		//Ĭ�ϴ�����ʾ����ϵͳʱ��
		Date date=new Date();
		//System.out.println(date);
		///��ȡdate�ڲ�ά����longֵ
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
