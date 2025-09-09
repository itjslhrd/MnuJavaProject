
public class Exam_24 {
	//반환타입 X,  매개변수 X
	static void test() {
		System.out.println("test() 메소드가 호출됨");
	}
	static void add(int num) {
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
	static int sum() {
		int s=0;
		for(int i=1; i<=5; i++) {
			s += i;
		}
		return s;
	}
	static int exam(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		//호출
		test();
		add(10);
		int s = sum();
		System.out.println("s=" + s);
		
		System.out.println(exam(10,20));
	}
	//
}
