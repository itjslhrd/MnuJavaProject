//키보드 입력
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("국어입력:");
		int a = scn.nextInt();
		System.out.print("영어입력:");
		int b = scn.nextInt();
		System.out.print("수학입력:");
		int c = scn.nextInt();
		
		int t = a + b + c;//총점
		int p = t/3;// double p = t / 3.;
		
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + p);
		
		
		
	}

}
