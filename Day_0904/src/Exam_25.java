//키보드로 번호 이름 국어, 영어, 수학 입력
//총점, 평균, 학점(A,B,C,D,F) 출력
import java.util.Scanner;
public class Exam_25 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int bun = scn.nextInt();
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		//총점, 평균, 학점계산
		int tot = kor + eng + mat;
		int ave = tot / 3;
		String grade="";
		if(ave>=90) {
			grade="A";
		}else if(ave>=80) {
			grade="B";
		}else if(ave>=70) {
			grade="C";
		}else if(ave>=60) {
			grade="D";
		}else {
			grade="F";
		}
		int max = kor;
		if(max < eng) {
			max = eng;
		}
		if(max < mat) {
			max = mat;
		}
		//출력
		System.out.println("번호\t이름\t총점\t평균\t학점\t최대점수");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(grade + "\t");
		System.out.print(max + "\t");
		


	}

}
