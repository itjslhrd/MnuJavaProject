
public class Exam_12 {
	public static void main(String[] args) {
		//1 ~ 10정수 출력( 1 2 3 4 5 6 7 8 9 10)
		for(int x=1; x<=10; x++) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		
		//1 ~ 10 홀수 출력(1 3 5 7 9)
		for(int y=1; y<=10; y+=2) {
			System.out.print(y + " ");
		}
		System.out.println();
		//1 ~ 10 짝수 출력(2 4 6 8 10)
		for(int k=2; k<=10; k+=2) {
			System.out.print(k + " ");
		}
		System.out.print("\n");
		// 10 ~ 1 (10 9 8 7 6 5 4 3 2 1)
		for(int a=10; a>=1; a--) {
			System.out.print(a + " ");
		}
	}

}
