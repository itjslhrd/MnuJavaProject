package model;
class BB{
	void test() {
		System.out.println("Super BB");
	}
	void exam() {
		System.out.println("Super Hello");
	}
}

class SubBB extends BB{
	//오버라이딩(재정의)
	void test() {
		super.test();
		System.out.println("Child  BB");
	}
}

final class ChildBBB extends SubBB{
	
}

public class Exam_08 {
	public static void main(String[] args) {
		BB b = new BB();
		b.test();
		b.exam();
		System.out.println("-----------------");
		
		SubBB sb = new SubBB();
		sb.test();//오버라이딩된 메소드 호출
		sb.exam();
	}

}
