//3개의 정수를 입력 최대값, 최소값 출력

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 4개 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		
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
		if(a < d) {
			int imsi = a;
			a = d;
			d = imsi;
		}

		if(b < c) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		if(b < d) {
			int imsi = b;
			b = d;
			d = imsi;
		}
		if(c < d) {
			int imsi = c;
			c = d;
			d = imsi;
		}

		System.out.printf("%d > %d > %d > %d", a,b,c,d);
	}

}
