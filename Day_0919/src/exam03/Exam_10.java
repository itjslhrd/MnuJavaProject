package exam03;

import java.io.IOException;

//예외처리
public class Exam_10 {
	public static void main(String[] args) {
		System.out.print("1문자 입력:");
		try {
			int ch = System.in.read();//1문자 입력 정수로 반환
			System.out.println("문자는 : " + ch);
		}catch(IOException e) {
			System.out.println("Error ");
		}
		
		//
	}

}
