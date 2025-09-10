//배열 공유

import java.util.Arrays;

public class Exam_03 {
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		
		int a[] = score;
		
		System.out.println("score : " + Arrays.toString(score));
		System.out.println("score : " + Arrays.toString(a));
		
		a[0] = 100;
		System.out.println("score : " + Arrays.toString(score));
		System.out.println("score : " + Arrays.toString(a));
		
	}

}
