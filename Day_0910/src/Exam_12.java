
public class Exam_12 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int cnt=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<5; j++) { //j<a[i].length
				cnt++;
				a[i][j] = cnt;
			}
		}
		//출력
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.print("\n");//줄바꿈
		}
	}

}
