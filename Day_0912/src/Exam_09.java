//정렬(Sort)
public class Exam_09 {
	public static void main(String[] args) {
		int arr[]= {7,9,5,8,4,6,8,7,4,9,7,6};
		System.out.print("Data : ");
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n");
		//선택정렬(오름차순)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					//교환
					int imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
			}
		}
		
		System.out.print("Sort : ");
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n");
	}
}
