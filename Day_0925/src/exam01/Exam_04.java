package exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/person.txt"));
		
		System.out.println("사원번호\t이름\t성별\t생년월일\t급여");
		while(scn.hasNextLine()) {
			
			String temp = scn.nextLine();
			if(temp.equals("")) {
				break;
			}
			
			//String str[] = scn.nextLine().split(",");
			String str[] = temp.split(",");
			
			System.out.print(str[0] + "\t");
			System.out.print(str[1] + "\t");
			String gender = "여자";
			if(str[2].equals("M")) {
				gender = "남자";
			}
			System.out.print(gender + "\t");
			String birth = str[3].substring(0,2)+"년" +
					str[3].substring(2,4)+"월" +
					str[3].substring(4)+"일";
			System.out.print(birth + "\t");
			System.out.print(String.format("%,d", Integer.parseInt(str[4])) + "\n");
		}
	}

}
