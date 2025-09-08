//키보드로 점수를 입력 80 ~ 90 사이면 "합격"
//아니면 "불합격"

import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = scn.nextInt();
		
		if(score>=80 && score<=90) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}

		if(score>=80) {
			if(score<=90) {
				System.out.print("합격");
			}else {
				System.out.print("불합격");
			}
		}else {
			System.out.print("불합격");
		}
	}

}
