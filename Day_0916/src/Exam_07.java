class AA{
	int bun;
	String name;
	//기본생성자 : 객체 생성, 객체생성시 초기화
	AA(){
		//System.out.println("AAAA");
	}
	void aaPrint() {
		System.out.println("bun = " + bun);
		System.out.println("name = " + name);
	}
}

class BB{
	int bun;
	String name;
	//오버로딩 : 메소드이름은 같고, 매개변수(개수, 타입, 순서) 다름
	BB(){}
	BB(int b){
		bun = b;
	}
	BB(String n){
		name = n;
	}
	BB(int b, String n){
		bun=b;
		name=n;
	}
	void bbPrint() {
		System.out.println("bun = " + bun);
		System.out.println("name = " + name);
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.bun=1;
		a1.name="aaaa";
		a1.aaPrint();

		BB b1 = new BB(111);
		b1.bbPrint();
		BB b2 = new BB("AAAA");
		b2.bbPrint();
		BB b3 = new BB(1011,"CCCC");
		b3.bbPrint();
		
	}

}
