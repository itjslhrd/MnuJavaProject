// =정수 한자리 암산 연습

import java.util.Random;
import java.util.Scanner;

public class Exam_23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		int jDap = 0;
		System.out.println("암산 연습 프로그램");
		for(int i=1; i<=3; i++) {
			int su = r.nextInt(9)+1;
			jDap += su;
			System.out.println(su);
		}
		System.out.println("-------");
		System.out.print("정답:");
		int dap = scn.nextInt();
		
		if(jDap == dap) {
			System.out.println("정답입니다");
		}else {
			System.out.println("오답입니다 : " +  jDap);
		}
	}

}
