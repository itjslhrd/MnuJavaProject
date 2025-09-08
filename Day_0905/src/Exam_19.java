//1 ~ 100 중에서 홀수만 출력 후
//마지막에 홀수 합 출력
// 1 3 5 7 8 . . . 
// 홀수 합 : 2500
public class Exam_19 {
	public static void main(String[] args) {
		int tot=0;
		int cnt=0;//개수카운트
		for(int x=1; x<=100; x++) {
			if(x%2==1) {
				System.out.printf("%3d", x);
				cnt++;
				tot += x;
				if(cnt%10==0) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		System.out.printf("1~100 홀수 합 : %d", tot);
	}

}
