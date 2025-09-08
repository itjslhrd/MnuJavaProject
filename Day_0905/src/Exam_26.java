
public class Exam_26 {
	public static void main(String[] args) {
		int arr[] = {90,55,77,45,60,80};
		System.out.print("Data:");
		for(int x=0; x<arr.length; x++) {
			System.out.printf("%5d",arr[x]);
		}
		System.out.print("\n");
		
		int cnt=0;
		System.out.print("70이상 데이터 :");
		for(int x=0; x<arr.length; x++) {
			if(arr[x]>=70) {
				System.out.printf("%5d",arr[x]);
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.print("70이상 데이터 수 :" + cnt);
		
	}

}
