package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	int bun;//번호
	String name;//이름
	String gender;//성별
	Student(){}
	Student(int bun,String name, String gender){
		this.bun=bun;
		this.name=name;
		this.gender=gender;
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> sList = new ArrayList();
		while(true) {
			System.out.print("학생등록:");
			int bun = scn.nextInt();//번호(숫자)
			if(bun == 0) {
				break;
			}
			String name = scn.next();//이름
			String gender = scn.next();//성별(M/F)
			
			Student st = new Student(bun,name,gender);
			sList.add(st);
		}
		// 출력
		System.out.println("번호\t이름\t성별");
		for(Student stu : sList) {
			String g = "여자";
			if(stu.gender.equalsIgnoreCase("m")) {
				g="남자";
			}
			System.out.print(stu.bun + "\t");
			System.out.print(stu.name + "\t");
			System.out.print(g + "\n");
		}
		
	}

}
