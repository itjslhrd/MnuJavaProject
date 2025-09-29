package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exam_09 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime nowtime = LocalDateTime.now();
		System.out.println(nowtime);

	}

}
