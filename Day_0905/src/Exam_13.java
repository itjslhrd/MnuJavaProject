// 1 ~ 10 정수 중에서 홀수 만 출력
public class Exam_13 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		System.out.print("\n");
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
}
