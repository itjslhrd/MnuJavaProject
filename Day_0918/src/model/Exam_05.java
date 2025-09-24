package model;
//상속
class Super{
	int a=100;
	void print() {
		System.out.println("a=" + a);
	}
}
class Child extends Super{
	int a=3000;
	void test() {
		System.out.println("Super a= " + super.a);
		System.out.println("Child a= " + a);
	}
	
}

public class Exam_05 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("a=" + c.a);
		c.test();
	}

}
