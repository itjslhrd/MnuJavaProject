//키보드로 5개의 점수를 입력 합계를 구하여 출력

import java.util.Scanner;

public class Exam_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s=0;
		for(int i=1; i<=5; i++) {
			System.out.print(i+"번 입력");
			int a = scn.nextInt();
			s += a;
		}
		System.out.println(" 합계 : " + s);
	}

}
