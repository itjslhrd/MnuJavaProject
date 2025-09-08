//2개의 정수 입력 큰값, 작은값 출력

import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("2개의 정수입력:"); 
		int a = scn.nextInt();
		int b = scn.nextInt();
		int max, min;
		if(a>b) {
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
