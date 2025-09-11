//검색(선형 검색, 이진 검색)

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		int score[]= {80,60,90,50,77,59,65,88,95,66, 77};
		Scanner scn = new Scanner(System.in);
		
		System.out.print("찾는 값 :");
		int var = scn.nextInt();
		boolean bool = false;
		for(int i=0; i<score.length; i++) {
			if(var == score[i]) {
				System.out.printf("%d는 %d번째 있음\n",var, i);	
				bool = true;
				//break;//1개만 검색
			}
		}
		if(!bool) {
			System.out.printf("%d는 없음",var);
		}
	}

}
