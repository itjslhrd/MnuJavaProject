//순위(석차)계산
public class Exam_06 {
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		int rank[] = new int[score.length];
		
		for(int i=0; i<score.length;i++) {
			int r = 1;
			for(int j=0; j<score.length;j++) {
				if(score[i] < score[j]) {
					r++;
				}
			}
			rank[i] = r;
		}
		
		System.out.println("점수\t순위");
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i] + "\t" + rank[i]);
		}
	}

}
