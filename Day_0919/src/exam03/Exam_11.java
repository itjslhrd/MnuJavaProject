package exam03;

import java.io.IOException;

//예외처리
public class Exam_11 {
	public static void main(String[] args) {
		System.out.print("1문자 입력:");
		try {
			char ch = (char)System.in.read();//1문자 입력 정수로 반환
			System.out.println("문자는 : " + ch);
		}catch(IOException e) {
			System.out.println("예외 메시지 : " + e.getMessage());
			//예외추적
			e.printStackTrace();
		}
		
		//
	}

}
