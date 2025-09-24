package exam02;
//수학 관련 클래스 Math
public class Exam_04 {

	public static void main(String[] args) {
		double dy = 12 * Math.PI;
		System.out.println("dy=" + dy);
		System.out.println("5-7 : " + (5-7));
		System.out.println("절대값(5-7) : " + Math.abs(5-7));		
		System.out.println("두개의 숫자 중 큰값 (8, 4) : " + Math.max(8,4));
		System.out.println("두개의 숫자 중 큰값 (0.8, 4) : " + Math.max(0.8,4));
		System.out.println("두개의 숫자 중 큰값 (8.5, 9.4) : " + Math.max(8.5,9.4));

		System.out.println("루트  2 값  : " + Math.sqrt(2));
		System.out.println("지수 승 2^3 값  : " + Math.pow(2,3));//8
		//연산 후 올림, 버림, 반올림
		System.out.println("7.0/3 값  : " + (7.0/3));
		System.out.println("7.0/3 값(올림)  : " + Math.ceil(7.0/3));
		System.out.println("7.0/3 값(버림)  : " + Math.floor(7.0/3));
		System.out.println("7.0/3 값(반올림  : " + Math.round(7.0/3));
		
		//난수(임의 값(0 < 난수 < 1)사이 값
		System.out.println("난수 : " + Math.random());

		
	}

}
