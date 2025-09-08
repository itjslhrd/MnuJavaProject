//1 ~ 10 까지의 정수중에서 홀수만, 홀수합계 출력
public class Exam_14 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
			s+=i;// 합계
		}
		System.out.println("합계 : " +  s);
		
		int t=0;
		for(int i=1; i<=10 ;i++) {
			if(i%2==1) {
				System.out.println(i);
				t=t+i;
			}
		}
		System.out.println("합계 : " +  t);

	}

}
