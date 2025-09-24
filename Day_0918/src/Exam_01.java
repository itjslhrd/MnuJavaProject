class AA{
	int a=10;
	static int b=10;//정적(클래스) 변수
	
	static void test() {
		System.out.println("test()  호출됨");
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		AA aa = new AA();
		AA bb = new AA();
		System.out.println(aa.a);//10
		System.out.println(aa.b);//20
		System.out.println(AA.b);//20
		aa.b=100;
		
		System.out.println("-----------------");
		System.out.println(bb.a);//10
		System.out.println(bb.b);//100
		System.out.println(AA.b);
		
		AA.test();
	}

}
