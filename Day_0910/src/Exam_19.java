//데이터 카운트

import java.util.Scanner;

public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		System.out.print("입력:");
		while(true) {
			int a = scn.nextInt();
			//cnt++;
			//eof체크
			if(a == -99) {
				break;
			}
			cnt++;
		}
		System.out.print("입력건수 : " + cnt);
	}

}
