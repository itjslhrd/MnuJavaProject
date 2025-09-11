
public class Exam_04 {
	public static void main(String[] args) {
		int bun[]= {1,2,3,4,5};
		String name[] = {"김학생","이학생","강학생","오학생","최학생"};
		int score[]= {90,70,80,95,90};
		int tot=0;
		System.out.println("번호\t이름\t점수\t학점");
		for(int i=0; i<bun.length; i++) {//bun.length => 5
			System.out.print(bun[i] + "\t");
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			if(score[i]>=90) {
				System.out.print("A\n");
			}else if(score[i]>=80) {
				System.out.print("B\n");
			}else if(score[i]>=70) {
				System.out.print("C\n");
			}else if(score[i]>=60) {
				System.out.print("D\n");
			}else {
				System.out.print("F\n");
			}
			tot = tot + score[i];
		}
		System.out.println("총점:\t\t" + tot);
	}

}
