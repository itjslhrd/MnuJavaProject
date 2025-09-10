import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0; i<a.length; i++) {
			//System.out.print("Data" + (i+1) + ":");
			System.out.printf("Data %d : ", (i+1));
			a[i] = scn.nextInt();
		}
		
		System.out.print("Input Data :");
		for(int i=0; i<10; i++) {
			System.out.printf("%5d", a[i]);
		}
		System.out.print("\n");
		
		//합계와 평균, 최대값, 최소값을 출력한다
		int max = a[0];
		int min = a[0];
		int tot = 0;
		for(int i=0;i<10; i++) {
			if(max < a[i]) {
				max = a[i];
			}else if(min > a[i]) {
				min = a[i];
			}
			tot = tot + a[i];
		}
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
		System.out.printf("합계 : %d\n", tot);
		System.out.printf("평균 : %.2f\n", tot/10.);
		
	}

}
