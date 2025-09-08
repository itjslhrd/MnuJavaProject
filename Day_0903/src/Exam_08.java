//사칙연산(*, /, %, +, -)

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("2개의 정수 입력 :");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		//System.out.println(a + "," + b);
		int result = a*b;
		System.out.println(a + "*" + b + "=" + result);
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
		System.out.println(a + "%" + b + "=" + a%b);
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
	}

}
