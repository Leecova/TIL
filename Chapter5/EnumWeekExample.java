package Chapter5;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		week today = null;
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = week.SUNDAY;
			break;
		case 2:
			today = week.MONDAY;
			break;
		case 3:
			today = week.TUESDAY;
			break;
		case 4:
			today = week.WEDNESDAY;
			break;
		case 5:
			today = week.THURSDAY;
			break;
		case 6:
			today = week.FRIDAY;
			break;
		
			
			
			
		}
}
}
