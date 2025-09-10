//키보드로 입력 50 ~ 90사이 데이터만 배열에 저장 후 출력
//데이터는 7개만 저장

import java.util.Scanner;

public class Exam_24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = new int[7];
		int count=0;//count 변수 
		System.out.print("Input:");
		while(true) {
			int value = scn.nextInt();
			if(value >= 50 && value <= 90) {
				var[count] = value;
				count++;
			}
			if(count==7) {
				break;
			}
		}
		//출력
		System.out.print("Output:");
		for(int i=0; i<count; i++) {
			System.out.printf("%5d", var[i]);
		}
	}

}
