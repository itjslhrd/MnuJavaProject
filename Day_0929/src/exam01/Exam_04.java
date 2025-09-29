package exam01;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	Person(){}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+","+age;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		// 객체 저장
		Person p = new Person("김학셍", 30);
		pList.add(p);
		
		pList.add(new Person("이학생", 28));
		pList.add(new Person("강학생", 25));
		pList.add(new Person("이학생", 28));
		
		//전체 객체 출력
		System.out.println("전체 사원 : " + pList);
		
		//1. 기본 for()
		System.out.println("이름\t나이");
		for(int i=0; i<pList.size(); i++) {
			Person pp = pList.get(i);
			System.out.print(pp.name + "\t");
			System.out.print(pp.age + "\n");
		}
		System.out.println("------------------");
		//1. 기본 for()
		System.out.println("이름\t나이");
		for(int i=0; i<pList.size(); i++) {
			System.out.print(pList.get(i).name+ "\t");
			System.out.print(pList.get(i).age + "\n");
		}

		System.out.println("------확장 for------------");
		System.out.println("이름\t나이");
		for(Person ppp : pList) {
			System.out.print(ppp.name + "\t");
			System.out.print(ppp.age + "\n");
		}

	}

}
