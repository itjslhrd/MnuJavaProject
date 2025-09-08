import java.util.Scanner;
//정수 3개 입력 , 최대, 최소값
public class Exam_22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수 입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max = a;
		int min = a;
		if(max < b) {
			max = b;
		}
		if(min > b) {
			min = b;
		}
		
		if(max < c) {
			max = c;
		}
		if(min > c) {
			min = c;
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}

}
