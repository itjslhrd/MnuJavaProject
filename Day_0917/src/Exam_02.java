import java.util.Scanner;

class Member{
	String name;//이름
	String id;//아이디
	String pass;//비번
	String tel;//전화

	//회원가입 기능 구현
	int memReg(String name, String id, String pass) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		return 1;
	}
	//
	int memReg(String name, String id, String pass, String tel) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.tel=tel;
		return 1;
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

public class Exam_02 {
	public static void main(String[] args) {
		String name = "김학생";
		String id = "user";
		String pass = "1234";
		
		Member m1 = new Member();
		int row = m1.memReg(name, id, pass);
		if(row==1) {
			System.out.println("회원가입 성공");
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.print("아이디 :");
		String uid = scn.next();
		System.out.print("비밀번호 :");
		String upass = scn.next();
		
		//id,pass  비교
/*		
		if(uid.equals(m1.id)) {
			if(upass.equals(m1.pass)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비번오류");
			}
		}else {
			System.out.println("등록된 ID없음");
		}
*/
		row = m1.memLogin(uid, upass);
		if(row==1) {
			System.out.println("로그인 성공");
		}else if(row==0) {
			System.out.println("아이디 없음");
		}else {
			System.out.println("비번오류");
		}
		

	}

}
