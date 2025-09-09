
public class Exam_27 {
	static void swap(int[] a) {
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
	}
	public static void main(String[] args) {
		int arr[] = {10,20};
		System.out.printf("arr[0] = %d, arr[1]=%d\n", arr[0],arr[1]);
		
		swap(arr);
		System.out.printf("arr[0] = %d, arr[1]=%d\n", arr[0],arr[1]);

	}

}
