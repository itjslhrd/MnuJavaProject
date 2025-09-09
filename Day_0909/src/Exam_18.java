// 키보드로 최대 10개의 정수를 입력 배열에 저장후 총점, 평균을 추하여 출력
//단. 입력 값에 0이 있으면 입력자료의 끝이므로 출력 후 종료

import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = new int[10];
		int i;
		for(i=0; i<10; i++) {
			System.out.print("입력:");
			var[i] = scn.nextInt();
			if(var[i] == 0) {
				break;
			}
		}
		System.out.println("입력자료 수 : " + i);
		int tot=0;
		for(int x=0; x<i; x++) {
			tot = tot + var[x];
		}
		System.out.println("합계 : " +  tot);
		System.out.println("평균 : " +  (double)tot/i);
	}

}
