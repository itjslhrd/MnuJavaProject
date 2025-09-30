package exam01;

import java.util.ArrayList;
import java.util.List;

class Student2{
	int bun;//학번
	String name;//이름
	int kor;//국어
	int eng;//영어
	int mat;//수학
	
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		List<Student2> sList = new ArrayList<Student2>();
		
		System.out.println("리스트에 저장된 자료수 : " +  sList.size());
		System.out.println("리스트가 비어있는가 ? " +  sList.isEmpty());
	
		//객체 저장 add(객체);
		Student2 stu = new Student2();
		stu.setBun(1);
		stu.setName("김학생");
		stu.setKor(88);
		stu.setEng(95);
		stu.setMat(85);
		
		sList.add(stu);
		
		stu = new Student2();
		stu.setBun(2);
		stu.setName("이학생");
		stu.setKor(85);
		stu.setEng(90);
		stu.setMat(80);
		
		sList.add(stu);
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		if(sList.size() != 0) {
			for(int i=0; i<sList.size(); i++) {
				Student2 s = sList.get(i);
				int tot = s.getKor() + s.getEng() + s.getMat();
				double ave = (double)tot / 3;
				String grade="F";
				if(ave>=90) {
					grade="A";
				}else if(ave>=80) {
					grade="B";
				}else if(ave>=70) {
					grade="C";
				}else if(ave>=60) {
					grade="D";
				}
				System.out.print(s.getBun() + "\t");
				System.out.print(s.getName() + "\t");
				System.out.print(s.getKor() + "\t");
				System.out.print(s.getEng() + "\t");
				System.out.print(s.getMat() + "\t");
				System.out.print(tot + "\t");
				System.out.print(String.format("%.2f", ave) + "\t");
				System.out.print(grade + "\n");
			}
		}else {
			System.out.println("등록된 학생이 없습니다.");
		}
		
	}

}
