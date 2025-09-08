//키보드로 정수를 입력
//홀수 이면서5의 배수이면  true
//
import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scn.nextInt();
		
		//홀수/짝수
		boolean b1 = num % 2 == 1;
		//5의 배수
		boolean b2 = num % 5 == 0;
		
		boolean b3 = b1 && b2;
		
		boolean b4 = num % 2 == 1 && num % 5 == 0;
		
		System.out.println(num  + "=" + b3);
		System.out.println(num  + "=" + b4);
	}

}
