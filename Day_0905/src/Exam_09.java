import java.util.Scanner;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사칙연산:");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();

		switch(op) {
		case "+":
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case "/":
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		case "%":
			System.out.println(a+"%"+b+"="+(a%b));
			break;
		default:
			System.out.println("연산자 오류입니다.");
		}
	}

}
