//키보드로 정수 5개를 입력 배열에 저장 후 합계, 평균을 구하여 출력

import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("입력:");
		for(int i=0; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		//출력
		int tot=0;
		System.out.println("배열 요소 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			tot=tot+arr[i];
		}
		System.out.println("합계 : " +   tot);
		System.out.println("평균 : " +   (double)tot/arr.length);
	}
}
