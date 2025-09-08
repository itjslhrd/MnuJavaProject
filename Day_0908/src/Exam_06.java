//키보드로 정수 연산자 정수 입력 사칙연산을 수행하는 프로그램 작성
// 입력 : 7 * 5
import java.util.Scanner;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();

		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d", a,b,(a+b));
			break;
		case "-":
			System.out.printf("%d - %d = %d", a,b,(a-b));
			break;
		case "*":
			System.out.printf("%d * %d = %d", a,b,(a*b));
			break;
		case "/":
			System.out.printf("%d / %d = %d", a,b,(a/b));
			break;
		case "%":
			System.out.printf("%d %% %d = %d", a,b,(a%b));
			break;
		default:
			System.out.println("연산자 오류입니다.");
		}
	
	}

}
