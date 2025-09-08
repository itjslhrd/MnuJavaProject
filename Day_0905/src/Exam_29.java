
public class Exam_29 {
	public static void main(String[] args) {
		int score[] = {67,89,90,67,88,77,55,90,80};
		//데이터 출력
		System.out.print("Data :" );
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		
		//평균 계산
		int tot=0;
		for(int i=0; i<score.length;i++) {
			tot += score[i];
		}
		int ave = tot / score.length;
		
		//평균이상 데이터 출력
		int cnt=0;
		System.out.print("평균("+ave+")이상 점수:");
		for(int i=0; i<score.length; i++) {
			if(score[i]>=ave) {
				System.out.print(score[i] + " ");
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.print("평균("+ave+")이상 인원:" + cnt);
		
	}

}
