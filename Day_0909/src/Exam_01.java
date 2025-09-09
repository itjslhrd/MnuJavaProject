//10진수 입력 2진수 변환

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 :");
			int dec = scn.nextInt();
			if(dec==0) {
				break;
			}
			//2진수 변환
			String bin="";
			while(dec != 0) {
				int na = dec % 2;
				bin = na + bin;
				//int mok = dec / 2;//몫
				//dec = mok;
				dec = dec / 2;
			}
			System.out.println("2진수 : " + bin);
		}//while(true) 끝
	}
}
