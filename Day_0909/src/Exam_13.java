/*   1  2  3  4 10
 *   5  6  7  8 26
 *   9 10 11 12 42
 *  13 14 15 16 58
 *  17 18 19 20 74  
 */
public class Exam_13 {
	public static void main(String[] args) {
		
		int cnt=0;
		int tot=0;
		int total = 0;
		for(int i=1; i<=5; i++) {
			int sum = 0;
			for(int j=1; j<=5; j++) {
				cnt++;
				total += cnt;
				System.out.printf("%4d", cnt);
				sum += cnt;
			}
			System.out.printf("%4d", sum);
			System.out.print("\n");
			tot += sum;
		}
		System.out.println("1 ~ 25 합 : " + tot);
		System.out.println("1 ~ 25 합 : " + total);
	}

}
