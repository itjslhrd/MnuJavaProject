//키보드로 정수를 입력 1~100사이 이면 "Pass"  아니면  "No"

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1~100사이 정수입력:");
		int var = scn.nextInt();
		
		if(var>=1 && var<=100) {
			System.out.println("Pass");
		}else {
			System.out.println("No");
		}
	}

}
