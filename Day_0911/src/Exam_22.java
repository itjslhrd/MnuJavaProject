import java.util.Random;

public class Exam_22 {
	public static void main(String[] args) {
		Random r = new Random();//난수
		for(int i=1; i<=6; i++) {
			int lotto = r.nextInt(45)+1;//0 ~ 44
		
			System.out.print(lotto + " ");
		}
		

	}

}
