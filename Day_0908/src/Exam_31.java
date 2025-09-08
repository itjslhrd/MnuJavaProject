//약수 출력

import java.util.Scanner;

public class Exam_31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scn.nextInt();
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
