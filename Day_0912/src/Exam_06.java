import java.util.Arrays;

public class Exam_06 {
	public static void main(String[] args) {
		int value[]= {79,55,88,70,60,90,88,95};
		//배열 공유
		int val[] = value;
		
		System.out.println("value[0] = " + value[0]);
		System.out.println("val[0] = " + val[0]);
		val[0] = 100;
		System.out.println("value : " + Arrays.toString(value));
		System.out.println("val : " + Arrays.toString(val));
		
		
		//배열 복제
		int arr[] = value.clone();
		arr[1]=100;
		System.out.println("value : " + Arrays.toString(value));
		System.out.println("arr : " + Arrays.toString(arr));
		
	}

}
