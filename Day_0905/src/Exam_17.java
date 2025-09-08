//1 ~ 100까지 합계 출력 : 5050
public class Exam_17 {

	public static void main(String[] args) {
		int sum=0;// 합 저장용
		for(int x=1; x<=100; x++) {
			sum += x;
		}
		System.out.printf("1~100 합 = %d",sum);
	}

}
