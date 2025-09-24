package exam03;
class Sawon2{
	String name="aaaa";
	void print() throws Exception {
		if(name.equals("aaaa")) {
			System.out.println("name = " + name);
		}else {
			System.out.println("name = null");
		}
	}
}
public class Exam_15 {
	public static void main(String[] args) {
		
		Sawon2 sa = new Sawon2();
		try {
			sa.print();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Hello");
		}
		
		System.out.println("End");
	}

}
