
public class Exam_23 {
	public static void main(String[] args) {
		int temp[] = {56,90,77,80,69,95,85,78,93,85,89};
		//평균
		int sum = 0;
		for(int i=0; i<temp.length;i++) {
			sum = sum + temp[i];
		}
		double ave = (double)sum / temp.length;
		//평균 이상 데이터만 출력
		System.out.printf("%.2f 이상  Data : ",ave);
		int cnt=0;
		for(int i=0; i<temp.length; i++) {
			if(temp[i]>=ave) {
				System.out.printf("%5d", temp[i]);
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.printf("%.2f 이상  Data 수 : %d", ave, cnt);
		
	}

}
