//배열 처리
import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		//1. 확인
		System.out.print("배열요소 확인:");
		System.out.println(Arrays.toString(score));
		
		//2.기본 for()
		System.out.print("기본 for() :");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%5d", score[i]);
		}
		System.out.print("\n");
		
		//3.확장 for() => for(데이터 타입 : 배열명){    }
		System.out.print("확장 for() :");
		for(int x : score) {
			System.out.printf("%5d", x);
		}

	}

}
