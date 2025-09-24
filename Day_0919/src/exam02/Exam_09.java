package exam02;
interface DD{
	void add(int a, int b);
}
class SubDD implements DD{
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		// 익명구현객체
		DD d = new DD() {
			@Override
			public void add(int a, int b) {
				System.out.printf("%d+%d=%d",a,b,(a+b));
			}
		};
		d.add(10, 20);
	}

}
