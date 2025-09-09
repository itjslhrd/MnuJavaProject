//키보드로 7개의 데이터를 입력 배열에 저장 후 내림 차순 정렬 후 출력

import java.util.Scanner;

public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[7];
		System.out.print("입력:");
		for(int i=0; i<score.length; i++) {
			score[i] = scn.nextInt();
		}
		System.out.print("Data:");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
		System.out.print("\n");
		//내림차순 정렬
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i]<score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		//출력
		System.out.print("Sort:");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
		
	}

}
