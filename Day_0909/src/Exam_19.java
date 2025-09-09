import java.util.Arrays;

public class Exam_19 {
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,4,8,3};
		//배열 요소 확인
		System.out.println("배열 요소 확인 : " + Arrays.toString(arr));
		//배열 요소 갯수
		System.out.println("배열 요소 수 : " + arr.length);
		//배열 요소 출력 후 합계, 평균
		int tot=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			tot += arr[i];
		}
		System.out.print("\n");
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + ((double)tot/arr.length));
	}

}
