//데이터 카운트

import java.util.Scanner;

public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt=0;
		System.out.print("입력:");
		while(true) {
			int a = scn.nextInt();
			//cnt++;
			//eof체크
			if(a == -99) {
				break;
			}
			if(a >= 0) {
				arr[cnt] = a;
				cnt++;
			}
		}
		System.out.println("입력건수 : " + cnt);
		
		System.out.print("Data : ");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%5d", arr[i]);
		}
	}

}
