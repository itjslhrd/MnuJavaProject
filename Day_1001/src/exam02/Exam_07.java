package exam02;

import java.util.Stack;

//Stack
public class Exam_07 {
	public static void main(String[] args) {
		Stack st = new Stack();
		//비어 있는가?
		System.out.println("비어있는가 : " + st.isEmpty());
		
		//삽입
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		//비어 있는가?
		System.out.println("비어있는가 : " + st.isEmpty());
		//제거
		String a = (String)st.pop();
		System.out.println(a);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		

	}

}
