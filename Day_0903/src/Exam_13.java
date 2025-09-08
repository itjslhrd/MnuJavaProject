//키보드로 이름, 국,영,수학 입력
//총점,평균,비고출력
//비고는 평균80이상 합격, 아니면 불합격

import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name = scn.next();//이름
		int k = scn.nextInt();//국어
		int e = scn.nextInt();//영어
		int m = scn.nextInt();//수학
		
		int t = k+e+m;//총저
		double a = t/3.;//평균
		
		String by = (a>=80)?"합격":"불합격";
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + a);
		System.out.println("비고 : " + by);
		
		
		
		

	}

}
