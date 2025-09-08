import java.util.Scanner;
//정수 3개인력 최대값
public class Exam_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max=a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		System.out.println("max = " + max);
	}

}
