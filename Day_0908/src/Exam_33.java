//10진수 -> 2진수 변환

import java.util.Scanner;

public class Exam_33 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수입력:");
		int num = scn.nextInt();
		String bin="";
		while(num != 0) {
			int mok = num / 2;
			int na = num % 2;
			bin = na + bin;
			num = mok;
		}
		System.out.println(bin);
	}

}
