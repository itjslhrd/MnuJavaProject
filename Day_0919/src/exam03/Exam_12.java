package exam03;

import java.io.IOException;

public class Exam_12 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
			System.out.print(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.print("배열 인덱스 오류");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception eee) {
			
		}

	}

}
