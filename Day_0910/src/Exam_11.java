
public class Exam_11 {
	public static void main(String[] args) {
		int hak[][]= {{1,90,90,90,0,0},
				{2,80,80,80,0,0},
				{3,70,70,70,0,0},
				{4,60,60,60,0,0},
				{5,50,50,50,0,0}};
		
		//총점/평균계산
/*		for(int i=0; i<hak.length; i++) {
			hak[i][4] = hak[i][1]+hak[i][2]+hak[i][3];
			hak[i][5] = hak[i][4]/3;
		}
*/		
		for(int i=0; i<hak.length; i++) {
			for(int j=1; j<4; j++) {
				hak[i][4] = hak[i][4] + hak[i][j];
			}
			hak[i][5] = hak[i][4]/3;//평균
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
