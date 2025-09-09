/*              1
 *           2  3  4
 *        5  6  7  8  9
 *    10 11 12 13 14 15 16
 * 17 18 19 20 21 22 23 24 25 
 */

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄수입력:");
		int row = scn.nextInt();
		
		int cnt = 0;
		for(int i=1; i<=row; i++) {
			for(int k=1; k<=row-i; k++) {
				System.out.printf("%4s"," ");
			}
			for(int j=1; j<=i*2-1; j++) {
				cnt++;
				System.out.printf("%4d", cnt);
			}
			System.out.print("\n");
		}

	}

}
