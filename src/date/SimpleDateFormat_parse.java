package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String line="2018-08-08 08:08:31";
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(line);
		System.out.println(date);
	}
}
