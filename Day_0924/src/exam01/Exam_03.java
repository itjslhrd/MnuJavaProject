package exam01;

public class Exam_03 {
	public static void main(String[] args) {
		String str = "  Java Progrma Example Test  ";
		//문자열 앞, 뒤 공백 제거
		str = str.trim();//"Java Progrma Example Test"
		//"Test" --> "Sample" 대치
		str = str.replace("Test", "Sample");
		System.out.println("str="+str);
		
		//모두 소문자로 출력
		System.out.println("str="+str.toLowerCase());
		System.out.println("str="+str);

	}

}
