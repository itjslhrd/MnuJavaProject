package exam01;

public class Exam_04 {
	public static void main(String[] args) {
		String str="Hello World";
		//문자열 결합 concat();  "11" + 1
		String str2 = str.concat("AAAA");
		String str3 = str + "AAAA";
		
		//문자열 포함 유무 : contains();
		boolean bool = str.contains("K");
		System.out.println(bool);
		
		double ave = 3.1234567;
		System.out.println(String.format("%.2f", ave));
		System.out.println(String.format("%7.2f", ave));
		
		//문자열 위치 : indexOf();  lastIndexof()
		System.out.println(str.indexOf("X"));
		
		//문자열이 비어있는지 여부 isEmpty()
		
		String data="";
		boolean bool1 = data.isEmpty();
		if(bool1) {
			System.out.print("문자열이 비어 있음");
		}
		//if(aaa == null) {}
/*		
		String text=null;//비교불가
		if(text.isEmpty()) {
			System.out.println(text);
		}
*/		
		//문자열 분리 후 배열로 반환 : split(구분자)
		String tel="1111-2222,3333-4444,5555-6666";
		
		String telArr[] = tel.split(",");
		for(int i=0; i<telArr.length; i++) {
			System.out.println(telArr[i]);
		}
	}

}
