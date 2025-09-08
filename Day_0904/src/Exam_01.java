
public class Exam_01 {

	public static void main(String[] args) {
		int a;//변수선언
		//System.out.print("a=" + a);//초기화가 안되어 출력 불가
		
		a = 10;//대입
		System.out.print("a=" + a);
		
		int b = 20;//선언대입을 동시
		System.out.print("b=" + b);
		
		int c = a+b;//수식대입
		int d = c;//변수대입
		
		System.out.print("c=" + c);
	}

}
