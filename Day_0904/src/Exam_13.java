import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max = (a>b) ? a:b;
		max = (max > c) ? max : c ;
		
		System.out.println(a + "," + b +"," + c + "중 큰수 :" + max);
	}

}
