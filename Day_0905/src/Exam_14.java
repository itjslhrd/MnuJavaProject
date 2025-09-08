//1 ~ 25정수 출력
public class Exam_14 {
	public static void main(String[] args) {
		for(int x=1; x<=25; x++) {
			System.out.print(x + "\t");
			if(x%5==0) {
				System.out.print("\n");
			}
		}
		//
		for(int x=1; x<=25; x++) {
			System.out.printf("%5d", x);
			if(x%5==0) {
				System.out.print("\n");
			}
		}
	}

}
