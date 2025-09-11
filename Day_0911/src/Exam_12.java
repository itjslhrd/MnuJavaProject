
public class Exam_12 {
	public static void main(String[] args) {
		int data[][]= {{3,90,70,80,90,67,0,0},
				{1,88,77,68,89,90,0,0},
				{5,70,80,90,80,95,0,0},
				{2,95,75,85,79,88,0,0},
				{4,90,70,80,90,90,0,0}};
		//총점계산
		for(int i=0; i<data.length;i++) {
			data[i][6] = data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5];
		}
/*		
		for(int i=0; i<data.length; i++) {
			for(int j=1; j<=5; j++) {
				data[i][6] += data[i][j];
			}
		}
*/		
		//순위계산(총점기준)
		for(int i=0; i<data.length; i++) {
			int r=1;//자신은 1등
			for(int j=0; j<data.length; j++) {
				if(data[i][6] < data[j][6]) {
					r++;
				}
			}
			data[i][7] = r;
		}
		
		System.out.println("-------- Sort 전 ----------");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t순위");
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		//번호를 기준으로 오름차순 정렬
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i][0] > data[j][0]) {
					//교환할 항목수
					for(int k=0; k<data[0].length; k++) {
						int temp = data[i][k];
						data[i][k] = data[j][k];
						data[j][k] = temp;
					}
				}
			}
		}
		
		System.out.println("-------- Sort 후 ----------");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t순위");
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}

}
