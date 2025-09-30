package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Sawon{
	private int sabun;
	private String name;
	private boolean gender;//true:남자/false:여자
	private int age;
	Sawon(){}
	Sawon(int sabun,String name, boolean gender, int age){
		this.sabun=sabun;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	//사원번호 중복 검사
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon s = (Sawon)obj;
			return s.sabun==sabun;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return sabun;
	}
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		Set<Sawon> sSet = new HashSet();
		Sawon s = new Sawon(100,"김사원", false, 30);
		boolean bool = sSet.add(s);
		if(bool) {
			System.out.println("등록성공");
		}else {
			System.out.println("이미등록된 사원입니다.");
		}
		
		s = new Sawon(200,"김사원", false, 30);
		bool = sSet.add(s);
		if(bool) {
			System.out.println("등록성공");
		}else {
			System.out.println("이미등록된 사원입니다.");
		}
		
		s = new Sawon(300,"김사원", false, 30);
		bool = sSet.add(s);
		if(bool) {
			System.out.println("등록성공");
		}else {
			System.out.println("이미등록된 사원입니다.");
		}

		//출력
		System.out.println("번호\t이름\t성별\t나이");
		for(Sawon sa : sSet) {
			String gender = "여자";
			if(sa.isGender()) {
				gender="남자";
			}
			System.out.print(sa.getSabun() + "\t");
			System.out.print(sa.getName() + "\t");
			System.out.print(gender + "\t");
			System.out.print(sa.getAge() + "\n");
		}
		//반복자이용 출력
		System.out.println("번호\t이름\t성별\t나이");
		Iterator<Sawon> iter = sSet.iterator();
		while(iter.hasNext()) {
			Sawon ss = iter.next();
			String gender = "여자";
			if(ss.isGender()) {
				gender="남자";
			}
			System.out.print(ss.getSabun() + "\t");
			System.out.print(ss.getName() + "\t");
			System.out.print(gender + "\t");
			System.out.print(ss.getAge() + "\n");
		}
	}

}
