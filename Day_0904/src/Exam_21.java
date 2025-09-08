import java.util.Scanner;
//정수 3개인력 최소값
public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int min=a;
		if(min>b) {
			min=b;
		}
		if(min>c) {
			min=c;
		}
		System.out.println("min = " + min);
	}

}
