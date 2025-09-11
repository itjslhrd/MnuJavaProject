
public class Exam_13 {
	public static void main(String[] args) {
		int val[]= {1,2,3,4,5,6,7,8,9,10};
		//int tot =  val[0]+val[1]+ . . . .  + val[9]
		int tot=0;
		for(int i=0; i<val.length; i++) {
			tot += val[i];
		}
		//출력
		System.out.print("Data : ");
		for(int i=0; i<val.length; i++) {
			System.out.printf("%3d", val[i]);
		}
		System.out.print("\n");
		System.out.println("합계 : " + tot);
		
	}

}
