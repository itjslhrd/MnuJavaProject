
public class Exam_10 {
	public static void main(String[] args) {
		int hak[][]= {{1,90,90,90,0,0},
				{2,80,80,80,0,0},
				{3,70,70,70,0,0},
				{4,60,60,60,0,0},
				{5,50,50,50,0,0}};
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<hak.length;i++) {
			System.out.print(hak[i][0] + "\t");
			System.out.print(hak[i][1] + "\t");
			System.out.print(hak[i][2] + "\t");
			System.out.print(hak[i][3] + "\t");
			System.out.print(hak[i][4] + "\t");
			System.out.print(hak[i][5] + "\n");
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<hak.length;i++) {
			for(int j=0; j<hak[i].length;j++) {
				System.out.print(hak[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
