import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		System.out.print("번호입력 :");
		int bun = scn.nextInt();
		
		System.out.print("이름입력 :");
		String name = scn.next();
		
		System.out.print("국어입력 :");
		int kor = scn.nextInt();

		System.out.print("영어입력 :");
		int eng = scn.nextInt();

		System.out.print("수학입력 :");
		int mat = scn.nextInt();

		int tot = kor + eng + mat;
		double ave = tot / 3.0;
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
	}

}
