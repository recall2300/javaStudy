package courses;

import java.util.Calendar;

public class _13_Calendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		calendar.add(Calendar.HOUR, 5);
		
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
	}

}
