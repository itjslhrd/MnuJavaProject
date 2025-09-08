//키보드로 이름, 국어,영어,수학 입력, 총점, 평균, 학점을 구하여 출력
//학점은 평균 90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F
import java.util.Scanner;
public class Exam_08 {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.print("이름:");
		  String name = scn.next();
		  System.out.print("국어:");
		  int kor = scn.nextInt();
		  System.out.print("영어:");
		  int eng = scn.nextInt();
		  System.out.print("수학:");
		  int mat = scn.nextInt();
		  //총점, 평균, 학점계산
		  int tot = kor + eng + mat;
		  double ave = tot / 3.0;	  
		  String grade="";
		  switch((int)ave/10) {
		  case 10:
		  case 9:
			  grade="A";
			  break;
		  case 8:
			  grade="B";
			  break;
		  case 7:
			  grade="C";
			  break;
		  case 6:
			  grade="D";
			  break;
		  default:
			  grade="F";
		  }
		  
		  //출력
		  System.out.println("이름\t총점\t평균\t학점");
		  System.out.print(name + "\t");
		  System.out.print(tot + "\t");
		  System.out.printf("%.2f\t",ave);
		  System.out.print(grade + "\n");
		  
		  

	}

}
