import java.util.Scanner;

public class Exam_25 {
	static void add(int a, int b) {
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
	}
	static void sub(int a, int b) {
		System.out.printf("%d - %d = %d\n",a,b,(a-b));
	}
	static void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n",a,b,(a*b));
	}
	static void div(int a, int b) {
		System.out.printf("%d / %d = %d\n",a,b,(a/b));
	}
	static void mod(int a, int b) {
		System.out.printf("%d %% %d = %d\n",a,b,(a%b));
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사칙연산 :");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+")) {
			add(a,b);
		}else if(op.equals("-")) {
			sub(a,b);
		}else if(op.equals("*")) {
			mul(a,b);
		}else if(op.equals("/")) {
			div(a,b);
		}else if(op.equals("%")) {
			mod(a,b);
		}else {
			System.out.println("연산자 오류");
		}
	}

}
