package exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로그인 구현
public class Exam_04 {
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
		
		//키 포함 유무
		if(user.containsKey(id)) {
			if(user.get(id).equals(pass)) {
				System.out.println("OK");
			}else {
				System.out.println("Pass No");
			}
		}else {
			System.out.println("id NO");
		}
	}
}
