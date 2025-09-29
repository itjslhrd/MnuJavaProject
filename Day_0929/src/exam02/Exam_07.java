package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member{
	private String id;
	private String name;
	private int age;
	Member(){}
	Member(String id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
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

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Member> mList = new ArrayList<Member>();
		//입력
		while(true) {
			System.out.print("회원등록:");
			String str[] = scn.nextLine().split(" ");
			if(str[0].equalsIgnoreCase("end")) {
				break;
			}
			Member m = new Member(str[0], str[1], 
					Integer.parseInt(str[2]));
			//ID 중복검사 없음
			//mList.add(m);
			
			//id중복검사
			boolean bool = true;
			for(int x=0; x<mList.size(); x++) {
				if(m.getId().equalsIgnoreCase(mList.get(x).getId())){
					bool = false;
					break;
				}
			}
			if(bool) {
				mList.add(m);
			}else {
				System.out.println("ID 중복");
			}
		}
		//출력
		for(Member mem : mList) {
			System.out.print(mem.getId() + "\t");
			System.out.print(mem.getName() + "\t");
			System.out.print(mem.getAge() + "\n");
		}

	}

}
