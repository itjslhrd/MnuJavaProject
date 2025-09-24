package exam01;
class SuperC{
	int a=100;
	void test() {
		System.out.println("SuperC.a = " + a);
	}
}
class ChildC extends SuperC{
	int a=200;
	@Override
	void test() {
		System.out.println("ChildC.a = " + a);
	}

	void exam() {
		System.out.println("SuperC.a = " + super.a);
		System.out.println("ChildC.a = " + a);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		SuperC sc = new SuperC();
		sc.a=1000;
		sc.test();
		System.out.println("------------------------");
		ChildC cc = new ChildC();
		cc.test();
		cc.exam();
		System.out.println("------------------------");
		SuperC scc = new ChildC();//업케스팅
		scc.test();
		
		
		
	}

}
