package exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로그인 구현
public class Exam_03 {
	public static void main(String[] args) {
		//map(user)id, pass 저장
		Map<String,String> user = new HashMap();
		user.put("abcd1", "1234");
		user.put("user1", "1234");
		user.put("user2", "1234");
		user.put("abcd2", "1234");
		user.put("user3", "1234");
		//사용자 로그인
		Scanner scn = new Scanner(System.in);
		System.out.print("id :");
		String id = scn.next();
		System.out.print("pass :");
		String pass = scn.next();
		
		//아이디에 해당하는 비번 검색
		String pw = user.get(id);
		if(pw == null) {
			System.out.println("아이디 없음");
		}else {
			if(pass.equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비번 오류");
			}
		}
	}
}
