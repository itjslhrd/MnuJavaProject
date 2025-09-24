class AddCal{
	void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a,b,(a+b));
	}
	void add(int a, double b) {
		System.out.printf("%d + %f = %f\n", a,b,(a+b));
	}
	void add(double a, int b) {
		System.out.printf("%f + %d = %f\n", a,b,(a+b));
	}
	void add(double a, double b) {
		System.out.printf("%f + %f = %f\n", a,b,(a+b));
	}
	
	//가변인자(배열 방식)
	// addInt(double a, int ... a)
	//addInt(String name, double b, int ... a)
	int addInt(int ...  a) {
		int s=0;
		for(int i=0; i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		
		AddCal ad = new AddCal();
		ad.add(10, 3.14);
		ad.add(3.14,3.14);
		ad.add(5.777, 20);
		
		int result = ad.addInt(1,2,3,4,5);
		System.out.println("result : " + result);
		System.out.println("result : " + ad.addInt(1,2,3));
		
		
		
	}

}
