import java.util.Scanner;
//키보드로 5개의 데이터를 입력 합계, 평균을 구하여 출력
public class Exam_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;//데이터 수 카운트용
		int tot=0;//합계계산용
		System.out.print("Input Data :" );
		while(true) {
			int a = scn.nextInt();
			cnt++;
			tot=tot+a;
			if(cnt==5) {
				break;
			}
		}
		System.out.printf("합계 = %d\n", tot);
		System.out.printf("평균 = %.2f\n", tot/5.0);
	}

}
