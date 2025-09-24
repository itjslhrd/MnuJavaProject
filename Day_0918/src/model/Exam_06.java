package model;
class SuperA{
	int x = 10;
	int y = 20;
	
	void print() {
		System.out.printf("SuperA.x = %d\n", x);
		System.out.printf("SuperA.y = %d\n", y);
	}
}
class ChildA extends SuperA{
	int a = 100;
	int b = 200;
	void output() {
		System.out.printf("ChildA.x = %d\n", x);
		System.out.printf("ChildA.y = %d\n", y);		
		System.out.printf("ChildA.a = %d\n", a);
		System.out.printf("ChildA.b = %d\n", b);		
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		ChildA c = new ChildA();
		c.print();
		c.output();
	}

}
