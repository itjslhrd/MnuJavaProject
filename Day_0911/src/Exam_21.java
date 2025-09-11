
public class Exam_21 {
	public static void main(String[] args) {
		int var[]= {70,90,80,85,77,59,65,88,90,70,50};
		//전체 데이터 출력
		System.out.print("Data : ");
		for(int i=0; i<var.length; i++) {
			System.out.printf("%5d", var[i]);
		}
		System.out.print("\n");
		
		//최대값, 최소값, 합계
		int max = var[0];
		int min = var[0];
		int sum = var[0];
		for(int i=1; i<var.length; i++) {
			if(max < var[i]) {
				max = var[i];
			}
			if(min > var[i]) {
				min = var[i];
			}
			sum += var[i];
		}
		System.out.println("최대값 : " +  max);
		System.out.println("최소값 : " +  min);
		System.out.println("합계 : " +  sum);
		double ave = (double)sum / var.length;
		System.out.printf("평균 : %.2f" ,  ave);
	}
	

}
