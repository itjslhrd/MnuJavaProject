//키보드로 10개의 데이터를 입력
//70~90사이이의 데이터수를 출력

import java.util.Scanner;

public class Exam_22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;//카운트용
		for(int x=1; x<=10; x++) {
			System.out.print(x+"번 데이터 :");
			int score = scn.nextInt();
			if(score>=70 && score<=90) {
				cnt++;
			}
		}
		System.out.print("70~90 데이터수 : " + cnt);
	}
}
