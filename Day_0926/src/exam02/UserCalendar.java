package exam02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserCalendar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("년도 입력 :" );
		int year = scn.nextInt();
		System.out.print("월 입력 :" );
		int month = scn.nextInt();
		
		Calendar cal = new GregorianCalendar(year,month-1,1);
		//해당 월 마지막 날자 계산
		int maxday = cal.getActualMaximum(cal.DAY_OF_MONTH);
		//해당월의 시작 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year +"년" + month +"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=maxday; i++) {
			if(week <= 7) {
				System.out.print(i + "\t");
			}else {
				System.out.print("\n");
				System.out.print(i+"\t");
				week=1;
			}
			week++;
		}
	}
}
