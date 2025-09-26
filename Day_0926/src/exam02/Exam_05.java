package exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

//문자열형태의 날자를 변환
public class Exam_05 {
	public static void main(String[] args) throws Exception{
		String day="20250926";
		//문자열타입의 날자를 날자타입으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(day);
		System.out.println(date);
		
		//날자를 형식화
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf2.format(date);
		System.out.println(today);
		
		
	}

}
