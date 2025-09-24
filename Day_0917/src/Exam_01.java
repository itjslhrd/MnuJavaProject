import java.util.Scanner;

class Student{
	//속성(변수)
	int hakbun;
	String name;
	boolean gender;
	int age;
	Student(){}
	Student(int hakbun, String name){
		this.hakbun=hakbun;
		this.name=name;
	}
	Student(int hakbun, String name, boolean gender, int age){
		this.hakbun=hakbun;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	void stuPrint() {
		System.out.print(hakbun + "\t");
		System.out.print(name + "\n");
	}
	void stuPrint2() {
		System.out.print(hakbun + "\t");
		System.out.print(name + "\t");
		System.out.print(gender + "\t");
		System.out.print(age + "\n");
	}
	
}
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("학번 :");
		int hakbun = scn.nextInt();//1101
		System.out.print("이름 :");
		String name = scn.next();//aaa
		
		Student st1 = new Student();
		st1.hakbun=1111;
		st1.name="bbbb";
		
		Student st2 = new Student(hakbun, name);
		
		System.out.println("학번\t이름\t성별\t나이");
		System.out.print(st1.hakbun + "\t" + st1.name + "\n");
		System.out.print(st2.hakbun + "\t" + st2.name + "\n");
		st1.stuPrint();
		st1.stuPrint2();
		
		
		

	}

}
