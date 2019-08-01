package java.text;

import java.util.Date;


/**
 * 将一个字符串解析为一个date
 * @author admin
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String lien="2008-08-08 20:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(lien);
		System.out.println(date);
				
	}
}
