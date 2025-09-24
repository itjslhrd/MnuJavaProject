class CC{
	int bun;
	String name;
	boolean gender;
	int age;
	
	CC(){}
	CC(int bun, String name, boolean gender, int age){
		this.bun=bun;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	void ccPrint() {
		String g="여자";
		if(gender) {
			g="남자";
		}
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + g);
		System.out.println("나이 : " + age);
		
	}
}

public class Exam_08 {

	public static void main(String[] args) {
		CC c1 = new CC(1,"aaa", false, 30);
		c1.ccPrint();
		CC c2 = new CC(2,"bbbb", true, 28);
		c2.ccPrint();
		
	}

}
