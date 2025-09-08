//키보드로 5개의 데이터를 입력 합계, 평균을 구하여 출력

import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tot = 0;//합계계산용
		System.out.print("Input Data :");
		for(int i=1; i<=5; i++) {
			int a = scn.nextInt();
			tot = tot + a;
		}
		System.out.printf("합계 :  %d\n", tot);
		System.out.printf("평균 :  %.2f\n", tot/5.);
	}

}
