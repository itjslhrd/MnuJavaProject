//10진수 입력 2, 8, 16진수 변환

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 입력:");
			int dec = scn.nextInt();
			if(dec == 0) {
				break;
			}
			System.out.print("변환진수(2,8,16) :");
			int con = scn.nextInt();
			
			String bin="";
			while(dec != 0) {
				int na = dec % con;
				dec = dec / con;
				switch(na) {//16진수 변환
				case 10:
					bin = "A"+bin;
					break;
				case 11:
					bin = "B"+bin;
					break;
				case 12:
					bin = "C"+bin;
					break;
				case 13:
					bin = "D" + bin;
					break;
				case 14:
					bin = "E" + bin;
					break;
				case 15:
					bin = "F" + bin;
					break;
				default:
					bin = na + bin;
				}
			}
			System.out.println(con +"진수 : " + bin);
		}
	}

}
