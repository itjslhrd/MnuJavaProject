package exam01;
class SuperA{
	int bun=100;
}
class ChildA extends SuperA{
	
}

public class Exam_01 {
	public static void main(String[] args) {
		SuperA sa = new SuperA();
		
		ChildA ca = new ChildA();
		
		SuperA saa = new ChildA();//업 케스팅
		
		SuperA sac = ca;
		
		ChildA caa = (ChildA)saa;//다운케스팅
		
		//ChildA caa = (ChildA)new SuperA();//다운케스팅
		
		int a = (int)3.14;//강제 형변환
	}

}
