package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ������Խ�Date��String֮�以ת����������
 * һ�����ڸ�ʽ�ַ�����
 * @author ta
 *
 */
public class SimleDateFormat_format {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * 2018-09-19 10:26:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss E"	
			);
		/*
		 * String format(Date date)
		 * ��������Date����SDFָ�������ڸ�ʽ
		 * ת��Ϊһ���ַ���
		 */
		String line = sdf.format(now);
		System.out.println(line);
		
	}
}







