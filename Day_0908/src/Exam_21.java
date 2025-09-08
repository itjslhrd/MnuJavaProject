//키보드로 0이상의 데이터 5개 입력 합계, 평균 출력
//Input Data : 90 -90 80 70 -77 -6 -89 78 89 -70

import java.util.Scanner;

public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		int tot=0;//합계
		System.out.print("Input Data:");
		while(true) {
			int a = scn.nextInt();
			if(a>=0) {
				cnt++;
				tot=tot+a;
				if(cnt==5) {
					break;
				}
			}
		}//while 끝
		System.out.printf("합계: %d\n", tot);
	}

}
