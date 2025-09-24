package exam02;
//인터페이스 :  명세서
interface BB{
	abstract void test();
	int add(int a, int b);
	int sum(int ... a);
}
class SubBB implements BB{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int sum(int... a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		//BB bb = new BB();
		BB b1 = new SubBB();
		

	}

}
