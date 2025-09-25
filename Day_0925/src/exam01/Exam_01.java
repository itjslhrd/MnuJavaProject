package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("정수입력:");
		for(int i=0; i<5; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
