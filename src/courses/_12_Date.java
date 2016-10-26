package courses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _12_Date {
	public static void main(String[] args) {
		Date date = new Date(); //현재 날짜 시간정보를 가진다.
		System.out.println(date.toString());
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd 'at' hh:mm:ss a zzz");
		
		System.out.println(simpleDate.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		
		System.out.println(today-date.getTime());
	}
}
