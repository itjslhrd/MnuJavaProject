package exam02;

import java.util.Calendar;

//Calendar
public class Exam_08 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);//년
		int month = cal.get(Calendar.MONTH)+1;//월
		//월 0 ~ 11
		int date = cal.get(Calendar.DATE);//일
		//요일(1:일, 2:월 -- 7:토)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String weekday="";
		switch(week) {
		case 1:
			weekday="일요일";break;
		case 2:
			weekday="월요일";break;
		case 3:
			weekday="화요일";break;
		case 4:
			weekday="수요일";break;
		case 5:
			weekday="목요일";break;
		case 6:
			weekday="금요일";break;
		case 7:
			weekday="토요일";break;			
		}
		
		System.out.println(year + "년" + month +"월" + date +"일" + weekday + "입니다");
	}

}
