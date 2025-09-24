package exam01;

public class Exam_02 {
	public static void main(String[] args) {
		String str="90,70,88,89,90,67,89,90";
		//문자열 분리 split("구분자") = 배열로 반환
		String score[] = str.split(",");
		// 총점, 평균 구하여 출력
		int tot=0;//총점계산
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			tot = tot + Integer.parseInt(score[i]);
		}
		System.out.println("=====");
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + (double)tot/score.length);
		System.out.println("평균 : " + String.format("%.2f",(double)tot/score.length));
		

	}

}
