//정렬(오름차순/내림차순)
public class Exam_20 {
	public static void main(String[] args) {
		int arr[] = {50,90,70,80,40};
		System.out.print("Data:");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
		System.out.print("\n");
		//선택정렬(오름차순)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sort:");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
	}

}
