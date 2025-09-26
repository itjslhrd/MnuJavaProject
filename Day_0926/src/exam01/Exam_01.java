package exam01;

import java.util.StringTokenizer;

//문자열 파싱 : StringTokenizer
public class Exam_01 {
	public static void main(String[] args) {
		String str="123,456 789,444 666";
		StringTokenizer st = new StringTokenizer(str,", ");
		
		//토큰수
		int cnt = st.countTokens();
		System.out.println("토큰수 : " + cnt);
		
		//토큰 꺼내오기(첫번째)
		//String s = st.nextToken();
		
		//전체꺼내오기(순차적으로)
		for(int i=0; i<cnt; i++) {
			String s = st.nextToken();
			System.out.println(s);
		}
		
		System.out.println("----------------");
		st = new StringTokenizer(str,", ");
		//토큰 존재 유무  hasMoreTokens()
		//전체 꺼내오기
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
