// 관계연산자   ->  상등 연산자   -> 논리연산자
//이상 >=, 이하 <=, 미만 <, 크다 >
public class Exam_09 {
	public static void main(String[] args) {
		System.out.println("7>5 : " + (7>5));
		System.out.println("7<5 : " + (7<5));
		System.out.println("7>=5 : " + (7>=5));
		System.out.println("7<=5 : " + (7<=5));

		boolean bool = 7==5;
		System.out.println("7==5 : " + bool);
		bool = 7!=5;
		System.out.println("7!=5 : " + bool);

	}

}
