
public class Exam_16 {

	public static void main(String[] args) {
		int val[]= {1,2,3,4,5,6,7,8,9,10};
		// 모두 출력 후, 홀수 합,  짝수합 출력
		int tot = 0;//홀수 합
		int sum = 0;//짝수 합
		System.out.print("홀수 : ");
		for(int i=0; i<val.length; i++) {
			System.out.printf("%3d",val[i]);
			if(val[i]%2==1) {
				tot += val[i];
			}else {
				sum += val[i];
			}
		}
		System.out.print("\n");
		System.out.println("홀수 합 :" + tot);
		System.out.print("짝수 합 :" + sum);
	}

}
