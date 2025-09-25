package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("정수입력:");
		int cnt=0;
		while(scn.hasNextInt()) {
			arr[cnt] = scn.nextInt();
			cnt++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
