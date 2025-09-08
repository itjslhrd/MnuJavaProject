import java.util.Scanner;
//가장 작은값
public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int min = (a>b) ? b:a;
		min = (min > c) ? c : min ;
		
		System.out.println(a + "," + b +"," + c + "중 작은수 :" + min);
	}

}
