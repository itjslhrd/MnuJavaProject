
public class Exam_09 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},
				{10,20,30,40,50},{60,70,80,90,100}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}

}
