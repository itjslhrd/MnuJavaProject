package exam01;

public class Exam_05 {
	public static void main(String[] args) {
		String str="aaaBBBcccDDD";
		//문자열 대치(치환) replace("old","new");
		String str2 = str.replace("aaa", "AAA");
		System.out.println(str2);
		
		//문자열 잘라내기 substring(시작위치, 전위치);
		String jumin="901207-1234567";
		String ymd = jumin.substring(0,6);//0부터 6전까지
		String gender = jumin.substring(7, 8);
		String na = jumin.substring(8);//8부터 끝까지
		System.out.println("생년월일 : " + ymd);
		if(gender.equals("1")) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
		System.out.println("기타 : " + na);
		
		//대소문자 변환 : toLowerCase(): 소문자로, toUpperCase():대문자
		String end = "end";
		if(end.equals("END".toLowerCase())){
			
		}
		//문자열로 변환 String.valueOf()
		int a=100;
		double b=3.14;
		
		String a1 = String.valueOf(a);//String a1 = a+"";
		String b1 = String.valueOf(b);
		
		//문자열 공백 제거 trim(): 좌우 공백 제거
		String ss = "     A   A    ";
		System.out.println("0" + ss + "0");
		String sss = ss.trim();
		System.out.println("0" + sss + "0");
		
		//String -> 기본형 : "123" -> 123  paesrInt()
		int intA = Integer.parseInt("123");
		double doubleA = Double.parseDouble("3.14");
		
		
	}

}
