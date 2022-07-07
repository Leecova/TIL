package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateExample {
	public static void main(String[] args) {
		//Date
		Date date = new Date();
		//2022-07-05
		SimpleDateFormat format = new SingleDateFormat("yyyy년 MM월 dd일");
		//System.out.println(format.format(date));
				
		//Calendar
		Calendar calendar = Calendar.getInstance(); //싱글톤형식
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "년" + month + "월" + dayOfMonth + "일");
		
		//LocalDateTime으로 변경
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy")));
		//method chaining 메소드 체이닝 요즘 트렌디한 코드
		String format2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy년 MM월 dd일 E요일 hh:mm:ss"));
		System.out.println(format2);
		
	}

}
