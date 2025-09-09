//키보드로 5개의 정수를 입력 배열에 저장 후 출력

import java.util.Arrays;
import java.util.Scanner;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = new int[5];
		
		System.out.print("입력:");
/*		var[0] = scn.nextInt();
		var[1] = scn.nextInt();
		var[2] = scn.nextInt();
		var[3] = scn.nextInt();
		var[4] = scn.nextInt();
*/
		for(int i=0; i<5; i++) {//i<var.length
			var[i] = scn.nextInt();
		}
		//배열요소 확인
		System.out.println("배열 요소 확인 : " + Arrays.toString(var));
		//출력
		
		for(int i=0; i<var.length;i++) {
			System.out.printf("var[%d] = %d\n",i, var[i]);
		}
 	}

}
