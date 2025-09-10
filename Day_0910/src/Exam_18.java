import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		//입력
		int cnt=0;
		while(cnt<10) {
			System.out.printf("Data %d :", (cnt+1));
			a[cnt] = scn.nextInt();
			if(a[cnt] == -99) {
				break;
			}
			cnt++;
		}
		//출력
		System.out.print("Input Data :" );
		for(int i=0; i<cnt; i++) {
			System.out.printf("%5d", a[i]);
		}
		System.out.print("\n");
		
		//내림차순 정렬(버블소트)
		int imsi[] = a.clone();//배열 복제
		for(int i=0; i<cnt-1; i++) {
			for(int j=0; j<cnt-i-1; j++) {
				if(imsi[j] < imsi[j+1] ) {
					int temp = imsi[j];
					imsi[j] = imsi[j+1];
					imsi[j+1] = temp;
				}
			}
		}
		//출력
		System.out.print("Sort Data : ");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%5d", imsi[i]);
		}
	}

}
