package exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

//형식화 클래스
public class Exam_04 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now : " + now);
		
		//형식화 SimpleDateFormat();
		//y(년),M(월),d(일),h(시),m(분),s(초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String today = sdf.format(now);
		System.out.println(today);
		
	}

}
