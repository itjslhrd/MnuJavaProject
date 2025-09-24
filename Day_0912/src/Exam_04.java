//배열

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		//배열 요소 출력법
		//1. 배열요소 확인
		System.out.println("arr : " + Arrays.toString(arr));
		//2. 기본 for();
		System.out.print("for():");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.print("\n");
		//확장 for()
		System.out.print("확장 for():");
		for(int i : arr) {
			System.out.printf("%4d", i);
		}
	}

}




