
public class Exam_07 {
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " : ");
			int r = 1;
			for(int j=0; j<score.length;j++) {
				if(score[i] < score[j]) {
					r++;
				}
			}
			System.out.println(r);
		}
		
	}

}
