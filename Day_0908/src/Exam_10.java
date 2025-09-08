//3개의 정수를 입력 최대값, 최소값 출력

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		if(a < b) {
			int imsi = a;
			a = b;
			b = imsi;
		}
		if(a < c) {
			int imsi = a;
			a = c;
			c = imsi;
		}
		if(b < c) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		System.out.printf("%d > %d > %d", a,b,c);
	}

}
