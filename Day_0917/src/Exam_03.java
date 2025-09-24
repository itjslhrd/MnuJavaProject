import java.util.Scanner;

class Member2{
	String name;//이름
	String id;//아이디
	String pass;//비번
	String tel;//전화
	Member2(){}
	Member2(String name, String id, String pass){
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	Member2(String name, String id, String pass, String tel){
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.tel=tel;
	}
	
	//로그인 구현
	int memLogin(String id, String pass) {
		if(this.id.equals(id) && this.pass.equals(pass)) {
			return 1;//로그인 성공
		}else {
			if(!this.id.equals(id)) {
				return 0;//id 없음
			}else {
				return -1;//비번오류
			}
		}
	}
	
	
}

public class Exam_03 {
	public static void main(String[] args) {
		String name = "김학생";
		String id = "user";
		String pass = "1234";
		
		Member2 m1 = new Member2();
		if(m1.id == null) {
			System.out.println("회원가입 실패");
		}
		
		Member2 m2 = new Member2(name, id, pass);
		if(m2.id != null) {
			System.out.println(m2.name +"님 회원가입 성공");
		}
		
		Member2 m3 = new Member2("강학생","mnu","1234","010-1111-2222");
		if(m3.id != null) {
			System.out.println(m3.name +"님 회원가입 성공");
		}

		Scanner scn = new Scanner(System.in);
		System.out.print("아이디 :");
		String uid = scn.next();
		System.out.print("비밀번호 :");
		String upass = scn.next();

		int row = m2.memLogin(uid, upass);
		if(row==1) {
			System.out.println("로그인 성공");
		}else if(row==0) {
			System.out.println("아이디 없음");
		}else {
			System.out.println("비번오류");
		}

	}

}
