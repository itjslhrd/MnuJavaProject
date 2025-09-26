package exam01;
//출력
//번호   이름   점수1  점수2  점수3  점수4 점수5 최대  최소  합계

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_03 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/data2.txt"));
		StringTokenizer st = null;

		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t합계");
		while(scn.hasNextLine()) {
			st = new StringTokenizer(scn.nextLine()," ,");
			int bun = Integer.parseInt(st.nextToken());//번호
			String name = st.nextToken();//이름
			int score[] = new int[5];//점수5개
			score[0] = Integer.parseInt(st.nextToken());//점수1
			score[1] = Integer.parseInt(st.nextToken());//점수2
			score[2] = Integer.parseInt(st.nextToken());//점수3
			score[3] = Integer.parseInt(st.nextToken());//점수4
			score[4] = Integer.parseInt(st.nextToken());//점수5
			
			//최대, 최소, 합계
			int max = score[0];
			int min = score[0];
			int tot = score[0];
			for(int i=1; i<score.length; i++) {
				tot += score[i];
				if(max < score[i]) {
					max = score[i];
				}else if(min > score[i]) {
					min = score[i];
				}
			}
			
			//출력
			System.out.print(bun + "\t" + name + "\t");
			for(int i=0; i<score.length; i++) {
				System.out.print(score[i] + "\t");
			}
			System.out.print(max + "\t" + min + "\t" + (tot-max-min) + "\n");
		}
	}
}
