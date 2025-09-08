//키보드로 정수 연산자 정수 입력
//사칙연산을 수행하는 프로그램 작성
import java.util.Scanner;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사칙연산:");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+")) {
			System.out.println(a + "+" + b + "=" + (a+b));
		}else if(op.equals("-")) {
			System.out.println(a + "-" + b + "=" + (a-b));
		}else if(op.equals("*")) {
			System.out.println(a + "*" + b + "=" + (a*b));
		}else if(op.equals("/")) {
			System.out.println(a + "/" + b + "=" + (a/b));
		}else if(op.equals("%")) {
			System.out.println(a + "%" + b + "=" + (a%b));
		}else {
			System.out.println("연산자 오류 입니다.");
		}
		
	}

}
