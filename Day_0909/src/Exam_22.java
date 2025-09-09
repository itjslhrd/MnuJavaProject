//Bubble Sort
public class Exam_22 {
	public static void main(String[] args) {
		int arr[] = {50,90,70,80,40};
		System.out.print("Data:");
		for(int i=0; i<arr.length;i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.print("\n");
		//버블소트(오름차순)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//출력
		System.out.print("Sort:");
		for(int i=0; i<arr.length;i++) {
			System.out.printf("%4d", arr[i]);
		}
		
	}

}
