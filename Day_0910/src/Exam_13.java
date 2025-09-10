
public class Exam_13 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int cnt=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				cnt++;
				a[i][j] = cnt;
				a[i][4] = a[i][4] + cnt;
				//a[i][4] = a[i][4] + a[i][j];
			}
		}
		
		//출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.print("\n");
		}

	}

}
