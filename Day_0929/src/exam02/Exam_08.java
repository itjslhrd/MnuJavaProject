package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member2{
	private String id;
	private String name;
	private int age;
	Member2(){}
	Member2(String id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	//id 중복검사용
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 mem =(Member2)obj;//형변환
			return mem.id.equals(id);//아이디만 같은 경우
			//return mem.id.equals(id) && mem.name.equals(name);//아이디와 이름
		}else {
			return false;
		}
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Member2> mList = new ArrayList<Member2>();
		//입력
		while(true) {
			System.out.print("회원등록:");
			String str[] = scn.nextLine().split(" ");
			if(str[0].equalsIgnoreCase("end")) {
				break;
			}
			Member2 m = new Member2(str[0], str[1], 
					Integer.parseInt(str[2]));
			//ID 중복검사 없음
			//mList.add(m);
			//ID 중복검사
			if(mList.contains(m)) {
				System.out.println("ID 중복");
			}else {
				mList.add(m);
			}
		}
		//출력
		for(Member2 mem : mList) {
			System.out.print(mem.getId() + "\t");
			System.out.print(mem.getName() + "\t");
			System.out.print(mem.getAge() + "\n");
		}

	}

}
