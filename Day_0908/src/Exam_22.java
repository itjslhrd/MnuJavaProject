//키보드로 정수를 입력 1 ~ 정수까지 출력
// 단. 한줄에 5개씩 출력하고 마지막에 합계출력

import java.util.Scanner;

public class Exam_22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input : ");
		int num = scn.nextInt();
		int tot=0;
		for(int i=1; i<=num; i++) {
			//System.out.print(i + " ");
			System.out.printf("%4d",i);
			tot=tot+i;
			if(i%5==0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		System.out.printf("1 ~ %d 까지 합 : %d",num,tot);
	}

}
