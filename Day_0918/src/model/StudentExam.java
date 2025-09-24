package model;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student();
		//s1.bun=20;
		s1.setBun(1);
		s1.setName("김학생");
		s1.setKor(90);
		s1.setEng(88);
		s1.setMat(90);
		
		System.out.println("번호 : " + s1.getBun());
		System.out.println("이름 : " + s1.getName());
		System.out.println("국어 : " + s1.getKor());
		System.out.println("영어 : " + s1.getEng());
		System.out.println("수학 : " + s1.getMat());
		System.out.println("총점 : " + (s1.getKor()+s1.getEng()+s1.getMat()));
		
	}

}
