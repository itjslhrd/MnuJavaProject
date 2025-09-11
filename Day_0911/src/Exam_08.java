
public class Exam_08 {
	public static void main(String[] args) {
		int data[][]= {{1,90,70,80,90,67},
				{2,88,77,68,89,90},
				{3,70,80,90,80,95},
				{4,95,75,85,79,88},
				{5,90,70,80,90,90}};
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t평균");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i][0] + "\t");
			System.out.print(data[i][1] + "\t");
			System.out.print(data[i][2] + "\t");
			System.out.print(data[i][3] + "\t");
			System.out.print(data[i][4] + "\t");
			System.out.print(data[i][5] + "\t");
			int tot = data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5];
			System.out.print(tot + "\t");
			System.out.print(tot/5. + "\n");
		}
	}

}
