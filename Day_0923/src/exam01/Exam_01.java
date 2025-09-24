package exam01;
class AA{
	int bun;
	String name;
	AA(){}
	AA(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
	@Override
	public String toString() {
		return bun + "," + name;
	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		String str = new String("Korea");
		System.out.println("str=" + str);
		
		AA aa = new AA();
		AA aa1 = new AA(1101,"김학생");
		System.out.println("aa= " + aa);
		System.out.println("aa1=" + aa1);
		
	}

}
