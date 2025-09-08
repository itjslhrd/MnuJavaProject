//키보드로 정수 입력 받어서 홀수 이면 홀수자체를 출력 
import java.util.Scanner;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int num = scn.nextInt();
		
		if(num%2==1) {
			System.out.println(num);
		}
	}
}
