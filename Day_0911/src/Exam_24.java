import java.util.Arrays;

public class Exam_24 {
	public static void main(String[] args) {
		int student[][]= {{3,90,80,85,0,1},
				{1,95,88,79,0,1},{5,80,70,70,0,1},
				{2,95,85,75,0,1},{4,80,80,90,0,1}};
		//개인별 총점 계산
		for(int i=0; i<student.length;i++) {
			student[i][4] = student[i][1]+student[i][2]+student[i][3];
		}
		//석차계산
		for(int i=0; i<student.length; i++) {
			//int r=1;
			for(int j=0; j<student.length; j++) {
				if(student[i][4] < student[j][4]) {
					student[i][5]++;
					//r++;
				}
			}
			//student[i][5]=r;
		}
		//배열 내용 확인
		for(int i=0; i<student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}
		System.out.println("---------------------------------");
		
		//총점 최대, 최소 학생 출력
		int max[] = student[0];
		int min[] = student[0];
		for(int i=0; i<student.length; i++) {
			if(max[4] < student[i][4]) {
				max = student[i];
			}
			if(min[4] > student[i][4]) {
				min = student[i];
			}
		}
		System.out.println("최대 : " + Arrays.toString(max));
		System.out.println("최소 : " + Arrays.toString(min));
		
		//번호를 기준으로 오름차순 정렬
		for(int i=0; i<student.length-1; i++) {
			for(int j=i+1; j<student.length; j++) {
				if(student[i][0] > student[j][0]) {
					int imsi[] = student[i];
					student[i] = student[j];
					student[j] = imsi;
				}
			}
		}
		//정렬 후 출력
		System.out.println("----------------------------------");
		//배열 내용 확인
		for(int i=0; i<student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}

	}

}
