//배열 복제

import java.util.Arrays;

public class Exam_02 {
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		//1. 수동 복제
		int cpyScore[] = new int[score.length];
		for(int i=0; i<score.length; i++) {
			cpyScore[i] = score[i];
		}
		System.out.println("원본:" + Arrays.toString(score));
		System.out.println("사본:" + Arrays.toString(cpyScore));
		
		//2. clone()메소드 이용
		int cpyScore2[] = score.clone();
		System.out.println("원본:" + Arrays.toString(score));
		System.out.println("사본:" + Arrays.toString(cpyScore2));
		
	}

}
