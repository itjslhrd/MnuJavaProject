/*  1                     1               1
 *  2  3                  1  2            2  2
 *  4  5  6               1  2  3         3  3  3
 *  7  8  9 10            1  2  3  4      4  4  4  4
 * 11 12 13 14 15         1  2  3  4  5   5  5  5  5  5
 */
public class Exam_07 {
	public static void main(String[] args) {
		int cnt=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				cnt++;
				System.out.printf("%3d", cnt);
			}
			System.out.print("\n");
		}
		System.out.println("-------------------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%3d", j);
			}
			System.out.print("\n");
		}
		
		System.out.println("-------------------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%3d", i);
			}
			System.out.print("\n");
		}
	}

}
