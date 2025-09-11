import java.util.Scanner;
//2진 검색
public class Exam_02 {
	public static void main(String[] args) {
		int score[]= {10,20,30,40,50,60,70,80,90};
		Scanner scn = new Scanner(System.in);
		
		System.out.print("찾는 값 :");
		int var = scn.nextInt();
		
		int low = 0;
		int high = score.length-1;
		while(true) {
			if(low > high) {
				System.out.printf("%d값은 없음", var);
				break;
			}
			int m = (low + high)/2;
			if(var==score[m]) {
				System.out.printf("%d는 %d번째 있음", var, m);
				 break;
			}
			if(var > score[m]) {
				low = m + 1;
			}else {
				high = m - 1;
			}
		}
		
	}

}
