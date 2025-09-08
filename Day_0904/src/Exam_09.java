//키보드로 점수를 입력 점수가 70 ~ 80사이면 true
// 아니면  false

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = scn.nextInt();
		
		boolean bool = score>=70 && score <= 80;
		System.out.println(score + ":" + bool);
		
		boolean a = score >= 70;
		boolean b = score <= 80;
		boolean c = a && b;
		System.out.println(score + ":" + c);
		

	}

}
