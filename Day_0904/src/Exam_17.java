//키보드로 점수를 입력 80 ~ 90 사이면 "합격"
//아니면 "불합격"

import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = scn.nextInt();
		
		String str="";
		if(score>=80 && score<=90) {
			str="합격";
		}else {
			str="불합격";
		}
		System.out.println("판정 = " + str);
		
		if(score>=80) {
			if(score<=90) {
				str="합격";
			}else {
				str="불합격";
			}
		}else {
			str="불합격";
		}
		System.out.println("판정 = " + str);
	}

}
