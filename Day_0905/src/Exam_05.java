//키보드로 연산자를 입력 연산자에 해당하는 연산을 수행하는
//프로그램 작성
import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] args) {
		int a=7, b=5;
		Scanner scn = new Scanner(System.in);
		System.out.print("연산자 : ");
		String op = scn.next();
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
			System.out.println("연산자 오류입니다.");
		}
	}

}
