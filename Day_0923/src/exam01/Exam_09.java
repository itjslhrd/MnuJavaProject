package exam01;

import java.util.Scanner;

//10진수 2진수 변환
public class Exam_09 {
	public static void main(String[] args) {
		StringBuffer bin = new StringBuffer();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 :" );
			int dec = scn.nextInt();
			if(dec==0) {
				break;
			}
			bin.delete(0, bin.length());
			while(dec != 0) {
				int na = dec % 2;
				bin.insert(0,na);
				dec = dec / 2;
			}
			System.out.println("22진수 : " + bin);
			//bin.reverse();
			//System.out.println("22진수 : " + bin);
		}
	}

}
