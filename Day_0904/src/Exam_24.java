//학점 계산하기
// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F

import java.util.Scanner;

public class Exam_24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		int val = scn.nextInt();
		
		String grade="";
		if(val>=90) {
			grade="A";
		}else if(val>=80) {
			grade="B";
		}else if(val>=70) {
			grade="C";
		}else if(val>=60) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println(val + "는" + grade);
		

	}

}
