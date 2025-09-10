//키보드로 5개의 정수를 입력 배열에 저장 후 출력
//while()

import java.util.Scanner;

public class Exam_26 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		int cnt=0;
		System.out.print("Input:");
		while(cnt<5) {
			arr[cnt] = scn.nextInt();
			cnt++;
		}

		//출력
		System.out.print("Output:");
		for(int i=0; i<5; i++) {
			System.out.printf("%5d", arr[i]);
		}
	}

}
