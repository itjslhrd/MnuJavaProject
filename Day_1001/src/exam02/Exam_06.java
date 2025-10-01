package exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student{
	String name;//이름
	boolean gender;//성별(true:남자/false:여자)
	int kor;//국어점수
	int eng;//영어점수
	int mat;//수학점수
	Student(){}
	Student(String name, boolean gender, int kor, int eng, int mat){
		this.name=name;
		this.gender=gender;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		Map<Integer, Student> sMap = new HashMap<>();
		sMap.put(1, new Student("김학생",false,90,77,89));
		sMap.put(2, new Student("이학생",true,95,75,85));
		sMap.put(3, new Student("박학생",true,88,77,80));
		sMap.put(4, new Student("강학생",false,80,90,80));
		sMap.put(5, new Student("홍학생",true,95,85,95));
		
		//키 추출
		Set<Integer> keySets = sMap.keySet();
		System.out.println("학번\t이름\t성별\t국어\t영어\t수학\t총점\t평균\t학점");
		for(Integer key : keySets) {
			System.out.print(key + "\t");//키(학번출력)
			// 키에 해당하는 Student
			Student stu = sMap.get(key);
			String gender="여자";
			if(stu.gender) {
				gender="남자";
			}
			int tot = stu.kor+stu.eng+stu.mat;
			double ave = tot / 3.;
			String grade="F";
			if(ave>=90) {
				grade="A";
			}else if(ave>=80) {
				grade="B";
			}
			// 생략
			
			System.out.print(stu.name + "\t" + gender + "\t");
			System.out.print(stu.kor + "\t" + stu.eng + "\t");
			System.out.print(stu.mat + "\t" + tot + "\t");
			System.out.print(String.format("%.2f", ave) + "\t");
			System.out.print(grade + "\n");
		}
		
		
	}

}
