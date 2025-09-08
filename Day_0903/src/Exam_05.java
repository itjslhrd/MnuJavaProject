
public class Exam_05 {
	public static void main(String[] args) {
		int bun = 1101;//번호
		String name = "김학생";//이름
		int kor = 95;//국어점수
		int eng = 89;//영어점수
		int mat = 85;//수학점수
		int a=(int)3.14;
		double b= 3;
		int tot = kor + eng + mat;//총점계산
		double ave = tot / 3.0;//평균계산
		
		System.out.println("번호 :" + bun);
		System.out.println("이름 :" + name);
		System.out.println("총점 :" + tot);
		System.out.println("평균 :" + ave);
	}
}
