/*
      * * * * *         *   
      * * * * *       * * *
      * * * * *     * * * * *
      * * * * *   * * * * * * * 
      * * * * * * * * * * * * * *
 */
public class Exam_30 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%2s", "*");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------");
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=5-i; k++) {
				System.out.printf("%2s"," ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.printf("%2s", "*");
			}
			System.out.print("\n");
		}
		
	}

}
