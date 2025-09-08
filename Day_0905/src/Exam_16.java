//1 ~ 20 까지의 정수 중에서 홀수는  ?
public class Exam_16 {
	public static void main(String[] args) {
		//카운트용 변수 선언
		int cnt=0;
		int sum=0;//합계계산용
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				System.out.printf("%3d", i);
				sum += i;//sum=sum+i;
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.println("Counter : " + cnt);
		System.out.println("Total : " + sum);
	}

}
