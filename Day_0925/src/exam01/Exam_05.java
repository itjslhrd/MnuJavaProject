package exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/person.txt"));
		
		System.out.println("사원번호\t이름\t성별\t생년월일\t급여");
		while(scn.hasNextLine()) {	
			String temp = scn.nextLine();
			if(temp.equals("")) {
				break;
			}
			Person p = new Person();
			String str[] = temp.split(",");
			p.setSabun(str[0]);
			p.setName(str[1]);
			p.setGender(str[2]);
			p.setBirth(str[3]);
			p.setPay(Integer.parseInt(str[4]));
			System.out.print(p.getSabun() + "\t");
			System.out.print(p.getName() + "\t");
			String gender = "여자";
			if(p.getGender().equals("M")) {
				gender="남자";
			}
			System.out.print(gender + "\t");
			String birth = p.getBirth().substring(0,2) + "년" +
					p.getBirth().substring(2,4) + "월" +
					p.getBirth().substring(4) + "일";
			System.out.print(birth + "\t");
			System.out.print(String.format("%,d", p.getPay()) + "\n");

		}//while 끝
	}

}
