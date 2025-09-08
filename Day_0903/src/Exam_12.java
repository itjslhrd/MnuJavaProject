//키보드로 정수를 입력 홀수, 짝수을 판별

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수입력:");
		int num = scn.nextInt();
		
		String str = (num%2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "는 " +  str +"입니다");
	}

}
