//정렬(Sort)
public class Exam_10 {
	public static void main(String[] args) {
		int arr[]= {7,9,5,8,4,6,8,7,4,9,7,6};
		System.out.print("Data : ");
		for(int i : arr) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n");
		//버블정렬(내림차순)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					int imsi = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = imsi;
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
