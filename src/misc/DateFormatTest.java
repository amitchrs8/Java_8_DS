package misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("hh:mm");
		ParsePosition ps = new ParsePosition(0);
		Date dt  = df.parse("12:02",ps);
		System.out.println(new Date(dt.getTime()));
		
		
	}
	
	
}
