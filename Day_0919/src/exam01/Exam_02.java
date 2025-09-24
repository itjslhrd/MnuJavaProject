package exam01;
class SuperB{
	int a=100;
}
class ChildB extends SuperB{
	int b=200;
}
public class Exam_02 {
	public static void main(String[] args) {
		SuperB sb = new SuperB();
		
		ChildB cb = new ChildB();
		System.out.println("a=" + cb.a);
		System.out.println("b=" + cb.b);
		
		SuperB sbb = new ChildB();
		System.out.println("a=" + sbb.a);
		//System.out.println("b=" + sbb.b);
		
		

	}

}
