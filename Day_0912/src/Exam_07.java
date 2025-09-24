
public class Exam_07 {
	public static void main(String[] args) {
		int arr[]= {7,9,5,8,4,6,8,7,4,9,7,6};
		System.out.print("arr : ");
		for(int x : arr) {
			System.out.printf("%3d", x);
		}
		System.out.print("\n");
		
		//최대값, 최소값, 합계
		int max = arr[0];
		int min = arr[0];
		int tot = 0;//합계
		for(int i=0; i<arr.length;i++) {
			 tot += arr[i];
			 if(max < arr[i]) {
				 max = arr[i];
			 }
			 if(min > arr[i]) {
				 min = arr[i];
			 }
			 //tot += arr[i];
		}
		System.out.printf("max = %d\n", max);
		System.out.printf("min = %d\n", min);
		System.out.printf("tot = %d\n", tot);
		
	}

}
