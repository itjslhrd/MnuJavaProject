//키보드로 정수 연산자 정수를 입력 사칙연산 수행하기

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Cal c = new Cal();
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+")) {
			//System.out.printf("%d + %d = %d\n", a,b,(a+b));
			c.add(a, b);
		}else if(op.equals("-")) {
			c.sub(a, b);
		}else if(op.equals("*")) {
			c.mul(a, b);
		}else if(op.equals("/")) {
			c.div(a, b);
		}else if(op.equals("%")) {
			c.mod(a, b);
		}else {
			System.out.print("Error");
		}
		
	}

}
