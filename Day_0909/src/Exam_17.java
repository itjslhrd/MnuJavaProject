//키보드로 번호 점수 7개 입력 총점, 평균을 구하여
//번호 총점 평균을 출력

import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[8];
		System.out.print("입력:");
		for(int i=0; i<score.length; i++) {
			score[i] = scn.nextInt();
		}
		
		//총점 계산
		//int t = score[1]+score[2]+ score[7]
		int tot=0;
		for(int i=1; i<score.length;i++) {
			tot=tot+ score[i];
		}
		
		System.out.println("번호 : " + score[0]);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + (tot/score.length-1));

	}

}
