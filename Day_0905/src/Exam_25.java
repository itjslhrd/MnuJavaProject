//배열요소 합
public class Exam_25 {
	public static void main(String[] args) {
		int arr[] = {90,55,77,45,60,80};
		int sum=0;
		System.out.print("Data : " );
		for(int x=0; x<arr.length; x++) {
			System.out.printf("%5d", arr[x]);
			sum += arr[x];//합계계산
		}
		System.out.print("\n");
		System.out.print("합계 : " +  sum);
	}

}
