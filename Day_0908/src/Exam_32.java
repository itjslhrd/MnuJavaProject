//소수 판별
import java.util.Scanner;

public class Exam_32 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scn.nextInt();
		int x;
		for(x=2; x<=num; x++) {
			if(num % x == 0) {
				break;
			}
		}
		if(num == x) {//자신으로 나누어지면
			System.out.println(num + "는 소수입니다.");
		}else {
			System.out.println(num + "는 소수아님.");
		}
		
	}

}
