package exam02;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//Timestamp
public class Exam_06 {
	public static void main(String[] args) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(time);
		
		String today = new SimpleDateFormat("yyyy-MM-dd").format(time);
		System.out.println(today);
	}

}
