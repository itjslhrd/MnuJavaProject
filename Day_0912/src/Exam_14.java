
public class Exam_14 {
	public static void main(String[] args) {
		int stu[][]= {{5,90,80,70,0,0},{2,85,78,95,0,0},
				{3,95,88,89,0,0},{1,95,90,88,0,0},{4,80,80,90,0,0}};
		
		//총점계산
		for(int i=0; i<stu.length; i++) {
			stu[i][4] = stu[i][1]+stu[i][2]+stu[i][3];
		}
/*		
		for(int i=0; i<stu.length; i++) {
			for(int j=1; j<=3; j++) {
				stu[i][4] += stu[i][j];
			}
		}
*/
		//총점을 기준으로 석차계산
		for(int i=0; i<stu.length; i++) {//학생수
			int r=1;//자신은 1등
			for(int j=0; j<stu.length; j++) {
				if(stu[i][4] < stu[j][4]) {
					r++;
				}
			}
			stu[i][5] = r;
		}
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
/*
		for(int i=0; i<stu.length;i++) {
			System.out.print(stu[i][0] + "\t");
			System.out.print(stu[i][1] + "\t");
			System.out.print(stu[i][2] + "\t");
			System.out.print(stu[i][3] + "\t");
			System.out.print(stu[i][4] + "\t");
			System.out.print(stu[i][5] + "\n");
		}
*/		
		for(int i=0; i<stu.length;i++) {
			for(int j=0; j<stu[i].length;j++) {
				System.out.print(stu[i][j] + "\t");
			}
			System.out.print("\n");
		}
		//번호를 오름차순 정렬
		for(int i=0; i<stu.length-1; i++) {
			for(int j=i+1; j<stu.length; j++) {
				if(stu[i][0] > stu[j][0]) {
					//교환
					for(int k=0; k<stu[0].length; k++) {
						int imsi = stu[i][k];
						stu[i][k] = stu[j][k];
						stu[j][k] = imsi;
					}
				}
			}
		}
		//정렬 후 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<stu.length;i++) {
			for(int j=0; j<stu[i].length;j++) {
				System.out.print(stu[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}




