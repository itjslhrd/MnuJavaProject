//객체 배열
class Person{
	int bun;
	String name;
	
	Person(int bun,String name){
		this.bun=bun;
		this.name=name;
	}
	void personPrint() {
		System.out.println(bun + "\t" + name);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Person p[] = new Person[5];
		Person p1 = new Person(1,"aaa");
		p[0] = p1;
		p[1] = new Person(2,"bbb");
		p[2] = new Person(3,"ccc");
		p[3] = new Person(4,"ddd");
		p[4] = new Person(5,"eee");
		
		System.out.println("번호\t이름");
		for(int i=0; i<p.length;i++) {
			System.out.println(p[i].bun + "\t" + p[i].name);
		}
		System.out.println("------------------------");
		for(int i=0; i<p.length;i++) {
			p[i].personPrint();
		}
		
		
	}

}
