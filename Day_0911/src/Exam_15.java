
public class Exam_15 {

	public static void main(String[] args) {
		int val[]= {1,2,3,4,5,6,7,8,9,10};
		//홀수만 출력 후 마지막에 홀수 합 출력
		int tot = 0;
		System.out.print("홀수 : ");
		for(int i=0; i<val.length; i++) {
			if(val[i]%2==1) {
				System.out.printf("%3d",val[i]);
				tot += val[i];
			}
		}
		System.out.print("\n");
		System.out.print("홀수 합 :" + tot);
	}

}
