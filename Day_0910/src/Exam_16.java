import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int cnt;
		for(cnt=0; cnt<10; cnt++) {
			System.out.printf("Data %d :",(cnt+1));
			a[cnt] = scn.nextInt();
			if(a[cnt]== -99) {
				break;
			}
		}
		//출력
		System.out.print("Input Data :" );
		for(int i=0; i<cnt; i++) {
			System.out.printf("%5d", a[i]);
		}
		System.out.print("\n");
		//최대, 최소, 합계

	}

}
