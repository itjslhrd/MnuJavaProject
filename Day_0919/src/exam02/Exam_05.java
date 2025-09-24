package exam02;
//추상클래스 :   미완성 클래스, 객체를 생성 불가
abstract class AA{
	int a=10;
	void test() {
		System.out.println("a=" + a);
	}
	//추상메소드
	abstract int add(int ... arr);
	 
}

class SubAA extends AA{
	@Override
	int add(int... arr) {
		
		return 0;
	}
}
class SubAB extends AA{
	@Override
	int add(int... arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		//AA a = new AA();
		
		AA a1 = new SubAA();
		a1.add(10,20);
		a1 = new SubAB();
		a1.add(1,2,3,4);
		
		
	}

}
