
public class Exam_06 {
	public static void main(String[] args) {
		int score[][]= {{1,90,80,90},
				{2,78,90,89},{3,95,88,79},
				{4,70,90,90},{5,77,88,95}};
		String name[] = {"이학생","김학생","강학생","유학생","홍학생"};
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int i=0; i<5; i++) {
			System.out.print(score[i][0] + "\t");
			System.out.print(name[i] + "\t");
			for(int j=1; j<4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

}
