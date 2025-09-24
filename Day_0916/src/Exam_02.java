class Cal{ //사칙연산용 클래스
	void add(int a, int b) {
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
	}
	void sub(int a, int b) {
		System.out.printf("%d - %d = %d\n",a,b,(a-b));
	}
	void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n",a,b,(a*b));
	}
	void div(int a, int b) {
		System.out.printf("%d / %d = %d\n",a,b,(a/b));
	}
	void mod(int a, int b) {
		System.out.printf("%d %% %d = %d\n",a,b,(a%b));
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		
		Cal c = new Cal();
		c.add(10, 50);

	}

}
