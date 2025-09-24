//싱글톤
class BB{
	//일반클래스
}
class CC{
	//싱글톤 클래스
	private CC() {}
	private static CC cc = new CC();
	public static CC getInstance() {
		return cc;
	}
	
}
public class Exam_02 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		
		//CC c1 = new CC();
		CC c1 = CC.getInstance();
		CC c2 = CC.getInstance();
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
	}

}
