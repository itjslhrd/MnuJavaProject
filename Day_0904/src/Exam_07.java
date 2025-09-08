import java.util.Scanner;
//키보드로 2개의 정수를 입력 사칙연산
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 2개 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int s = a * b;
		System.out.println(a + "*" + b + "=" + s);
		s = a / b;
		System.out.println(a + "/" + b + "=" + s);		
		s = a % b;
		System.out.println(a + "%" + b + "=" + s);
		s = a + b;
		System.out.println(a + "+" + b + "=" + s);
		s = a - b;
		System.out.println(a + "-" + b + "=" + s);

	}

}
