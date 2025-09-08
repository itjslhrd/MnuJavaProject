import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("2개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int max = (a>b) ? a:b;
		
		System.out.println(a + "," + b +"중 큰수 :" + max);
	}

}
