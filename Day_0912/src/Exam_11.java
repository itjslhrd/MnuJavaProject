//평균 이상 데이터 출력
public class Exam_11 {
	public static void main(String[] args) {
		int arr[]= {7,9,5,8,4,6,8,7,4,9,7,6};
		//평균계산
		//int tot = arr[0]+arr[1]+ . . . 
		int tot =0;
		for(int i=0; i<arr.length;i++) {
			tot += arr[i];
		}
		double ave = (double)tot / arr.length;
		int cnt=0;
		System.out.printf("평균 %.2f 이상 : ", ave);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=ave) {
				System.out.printf("%3d", arr[i]);
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.printf("평균 %.2f 이상 데이터 수: %d", ave, cnt);
	}

}
