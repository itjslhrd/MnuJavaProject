import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("Data %d : ", (i+1));
			arr[i] = scn.nextInt();
		}
		//출력
		System.out.print("Input Data :");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
		System.out.print("\n");
		
		//오름차순 정렬
		int imsi[] = arr.clone();
		for(int i=0; i<imsi.length-1; i++) {
			for(int j=i+1; j<imsi.length; j++) {
				if(imsi[i] > imsi[j]) {
					int temp = imsi[i];
					imsi[i] = imsi[j];
					imsi[j] = temp;
				}
			}
		}
		
		// 출력
		System.out.print("Sort Data :");
		for(int i=0; i<imsi.length; i++) {
			System.out.printf("%5d", imsi[i]);
		}
		
	}

}
