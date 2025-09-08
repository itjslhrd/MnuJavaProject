import java.util.Scanner;
//정수 3개인력 최대값
public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
/*		
		if(max>c) {
			max=max;
		}else {
			max=c;
		}
*/		
		if(max<c) {
			max=c;
		}
		System.out.println("max = " + max);
	}

}
