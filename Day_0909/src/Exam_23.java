//키보드로 7개의 데이터를 입력 배열에 저장 후 내림 차순 정렬 후 출력
import java.util.Scanner;
public class Exam_23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[7];
		System.out.print("입력:");
		for(int i=0; i<score.length; i++) {
			score[i] = scn.nextInt();
		}
		System.out.print("Data:");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
		System.out.print("\n");
		//내림차순 정렬(Bubble)
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-i-1; j++) {
				if(score[j]<score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		//출력
		System.out.print("Sort:");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
		
	}

}
