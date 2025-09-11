//행열 합계
public class Exam_07 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int cnt=0;
		for(int i=0; i<arr.length-1; i++) {//row
			for(int j=0; j<arr.length-1; j++) {//col
				cnt++;
				arr[i][j] = cnt;
				arr[i][4] += cnt;//열 합산
				arr[4][j] += cnt;//행 합산
				arr[4][4] += cnt;
			}
		}
		
		//배열 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

}
