package exam02;

import java.util.HashSet;
import java.util.Set;

class Person{
	int bun;
	String name;
	int age;
	Person(){}
	Person(int bun,String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	//번호, 이름이 같으면
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {//같은 객체인지 검사
			Person p = (Person)obj;//형변환
			return p.bun==bun && p.name.equals(name);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return bun + name.hashCode();
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Set<Person> pSet = new HashSet();
		Person p = new Person(1,"김학생",30);
		pSet.add(p);
		p = new Person(2,"오학생",25);
		pSet.add(p);
		p = new Person(1,"오학생",25);
		pSet.add(p);
		p = new Person(1,"오학생",30);
		pSet.add(p);
		
		System.out.println("학생 수 : " + pSet.size());
		
		p = new Person(3,"오학생",25);
		
		boolean bool = pSet.contains(p);
		if(bool) {
			System.out.println("포함되어 있음");
		}else {
			System.out.println("없음");
		}
		
	}

}
