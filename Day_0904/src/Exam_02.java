//키보드 입력
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int t = a + b + c;//총점
		int p = t/3;// double p = t / 3.;
		
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + p);
		
		
		
	}

}
