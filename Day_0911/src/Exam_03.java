
public class Exam_03 {
	public static void main(String[] args) {
		int bun[]= {1,2,3,4,5};
		String name[] = {"김학생","이학생","강학생","오학생","최학생"};
		int score[]= {90,70,80,95,90};
		int tot=0;
		System.out.println("번호\t이름\t점수");
		for(int i=0; i<bun.length; i++) {//bun.length => 5
			System.out.print(bun[i] + "\t");
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\n");
			tot = tot + score[i];
		}
		System.out.println("총점:\t\t" + tot);
	}

}
