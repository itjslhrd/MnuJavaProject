class A{
	int bun;
	String name;
	boolean gender;
}

public class Exam_04 {
	public static void main(String[] args) {
		A aa = new A();//객체(인스턴스) 생성
		System.out.println("bun = " + aa.bun);
		System.out.println("name = " + aa.name);
		System.out.println("gender = " + aa.gender);
		
		aa.bun=100;
		aa.name="김학생";
		aa.gender=true;
		
		System.out.println("bun = " + aa.bun);
		System.out.println("name = " + aa.name);
		System.out.println("gender = " + aa.gender);
		
		A aaa = new A();
		System.out.println("bun = " + aaa.bun);
		System.out.println("name = " + aaa.name);
		System.out.println("gender = " + aaa.gender);
		
		aa = new A();
		
		
	}

}
