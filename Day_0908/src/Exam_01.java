
public class Exam_01 {
	public static void main(String[] args) {
		char ch = 65;
		char ch2 = 'A';
		
		int a = ch;//자동형변환
		char ch3 = (char)a;//강제 형변환
		
		char ch4 = (char)67000;
		System.out.println("ch4 = " + ch4);
		
		int ab = (int)1234.1234;
		System.out.println("ab = " + ab);

	}

}
