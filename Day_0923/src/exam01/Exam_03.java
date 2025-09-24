package exam01;

public class Exam_03 {
	public static void main(String[] args) {
		String str="Korea-2025-09-22";
		//문자열 길이 문자열.length();
		int cnt = str.length();
		System.out.println("문자열 길이 : " + cnt);
		
		//문자열에서 특정위치의 문자 반환: 문자열.charAt(위치값);
		char ch = str.charAt(1);
		System.out.println("ch : " + ch);
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			System.out.println(a);
		}
	}

}
