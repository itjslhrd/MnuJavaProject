//3개의 정수를 입력 최대값, 최소값 출력

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max = a;
		int min = a;
		if(max < b) {
			max = b;
		}
		if(min > b) {
			min = b;
		}
		if(max < c) {
			max = c;
		}else if(min > c) {
			min = c;
		}
		System.out.println("max = " + max);
		System.out.printf("min = %d", min);
	}

}
