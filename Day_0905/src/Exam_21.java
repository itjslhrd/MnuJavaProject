import java.util.Scanner;

public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s=0;
		System.out.print("입력:");
		for(int i=1; i<=5; i++) {
			int a = scn.nextInt();
			s += a;
		}
		System.out.print("합계 : "  + s);
	}

}
