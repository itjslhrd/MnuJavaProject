class Student{
	//속성(멤보변수, 멤버필드)
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	//기능(메소드)
	void totAve() {
		tot = kor+eng+mat;
		ave = tot / 3.;
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.bun=1101;
		s1.name="김학생";
		s1.kor=90;
		s1.eng=88;
		s1.mat=95;
		//s1.tot = s1.kor+s1.eng+s1.mat;
		//s1.ave = s1.tot/3.;
		s1.totAve();
		
		s2.bun=1102;
		s2.name="이학생";
		s2.kor=95;
		s2.eng=85;
		s2.mat=75;
		//s1.tot = s1.kor+s1.eng+s1.mat;
		//s1.ave = s1.tot/3.;
		s2.totAve();
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(s1.bun + "\t");
		System.out.print(s1.name + "\t");
		System.out.print(s1.kor + "\t");
		System.out.print(s1.eng + "\t");
		System.out.print(s1.mat + "\t");
		System.out.print(s1.tot + "\t");
		System.out.print(s1.ave + "\n");

		System.out.print(s2.bun + "\t");
		System.out.print(s2.name + "\t");
		System.out.print(s2.kor + "\t");
		System.out.print(s2.eng + "\t");
		System.out.print(s2.mat + "\t");
		System.out.print(s2.tot + "\t");
		System.out.print(s2.ave + "\n");
		
	}

}
