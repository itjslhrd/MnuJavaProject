package exam01;

import java.util.ArrayList;
import java.util.List;

class Student3{
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
public class Exam_03 {
	public static void main(String[] args) {
		List<Student3> sList = new ArrayList<Student3>();
		
		System.out.println("리스트에 저장된 자료수 : " +  sList.size());
		System.out.println("리스트가 비어있는가 ? " +  sList.isEmpty());
	
		//객체 저장 add(객체);
		Student3 stu = new Student3();
		stu.setBun(1);
		stu.setName("김학생");
		stu.setKor(88);
		stu.setEng(95);
		stu.setMat(85);
		
		sList.add(stu);
		
		stu = new Student3();
		stu.setBun(2);
		stu.setName("이학생");
		stu.setKor(85);
		stu.setEng(90);
		stu.setMat(80);
		
		sList.add(stu);
		//변경
		//sList.set(1, stu)
		// 1번 2번 교환
		Student3 imsi = sList.get(0);
		sList.set(0,sList.get(1));
		sList.set(1, imsi);
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		if(sList.size() != 0) {
			for(int i=0; i<sList.size(); i++) {
				int tot = sList.get(i).getKor() + sList.get(i).getEng() + sList.get(i).getMat();
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
				System.out.print(sList.get(i).getBun() + "\t");
				System.out.print(sList.get(i).getName() + "\t");
				System.out.print(sList.get(i).getKor() + "\t");
				System.out.print(sList.get(i).getEng() + "\t");
				System.out.print(sList.get(i).getMat() + "\t");
				System.out.print(tot + "\t");
				System.out.print(String.format("%.2f", ave) + "\t");
				System.out.print(grade + "\n");
			}
		}else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
}
