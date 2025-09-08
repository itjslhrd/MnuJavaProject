//키보드로 점수 3개입력,
//3개의 점수 모두 40이상, 평균 60이상 "합격"
//아니면 불합격(불합격 사유는 과락, 평균미만)

import java.util.Scanner;
public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 점수입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int ave = (a+b+c)/3;
		
		if(a>=40 && b>=40 && c>=40 && ave>=60) {
			System.out.println("Pass");
		}else {
			//불합격
			if(a<40 || b<40 || c<40) {
				System.out.println("No :  과락");
			}else {
				System.out.println("No :  평균미만");
			}
		}

	}

}
