//키보드로 정수를 입력 80 ~ 90 사이면 Pass를 출력하고
//아니면 NoPass를 출력

import java.util.Scanner;
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int score = scn.nextInt();
		
		if(score>=80 && score<=90) {
			System.out.println("Pass");
		}else {
			System.out.println("NoPass");
		}
		
		if(score>=80) {
			if(score<=90) {
				System.out.println("Pass");
			}else {
				System.out.println("NoPass");
			}
		}else {
			System.out.println("NoPass");
		}
	}

}
