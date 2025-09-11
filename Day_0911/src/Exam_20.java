
public class Exam_20 {

	public static void main(String[] args) {
		int var[]= {70,90,80,85,77,59,65,88,90,70,50};
		//평균 이상 데이터 출력 수, 데이터 수 출력
		
		//평균계산하기(합계)
		int tot = 0;
		for(int i=0; i<var.length; i++) {
			tot += var[i];
		}
		double ave = (double)tot / var.length;
		
		System.out.printf("%.2f 이상 점수 : ", ave);
		int cnt=0;
		for(int i=0; i<var.length; i++) {
			if(var[i] >= ave) {
				System.out.printf("%5d", var[i]);
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.printf("%.2f 이상 데이터 수 : %d", ave, cnt);
	}

}
