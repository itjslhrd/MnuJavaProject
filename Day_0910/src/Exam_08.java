
public class Exam_08 {
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		System.out.println("줄수 : " + a.length);
		System.out.println("칸수 : " + a[0].length);
		System.out.println("값 : " + a[0][0]);
		
		//a[0]=10;
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}

}
