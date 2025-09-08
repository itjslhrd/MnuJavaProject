//키보드로 7개의 데이터를 입력 최대, 최소 구하기

import java.util.Scanner;

public class Exam_23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input Data:");
		int max = scn.nextInt();
		int min = max;
		for(int i=2; i<=7; i++) {
			int a = scn.nextInt();
			if(max < a) {
				max = a;
			}else if(min > a) {
				min = a;
			}
		}
		System.out.println("최대값 : " +  max);
		System.out.println("최소값 : " +  min);

	}

}
