
public class Exam_26 {
	static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.printf("a=%d, b=%d\n", a,b);

		//메소드 호출
		swap(a,b);
		System.out.printf("a=%d, b=%d\n", a,b);

	}

}
