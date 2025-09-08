//1-2+3-4+5-6+7-8+9-10
public class Exam_16 {

	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print("+" + i);
				s=s+i;
			}else {
				System.out.print("-" + i);
				s=s-i;
			}
		}
		System.out.print("=" + s);
	}

}
