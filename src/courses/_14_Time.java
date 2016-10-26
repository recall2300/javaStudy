package courses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class _14_Time {
	public static void main(String[] args) { //Java8version 
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		
		LocalDate localdate = LocalDate.of(2016, Month.OCTOBER, 26);
		System.out.println(localdate);
		
		LocalTime localtime = LocalTime.of(14, 26);
		System.out.println(localtime);
		
		LocalTime localtime2 = LocalTime.parse("14:14:14");
		System.out.println(localtime2);
		
		LocalDate localdate2 = timePoint.toLocalDate();
		System.out.println(localdate2);
		Month month = timePoint.getMonth();
		System.out.println(timePoint.getMonth());
		System.out.println(month.getValue());
	}
}
