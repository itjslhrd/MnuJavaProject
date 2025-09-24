package exam03;
class Sawon{
	String name;
	void print() {
		try {
			if(name.equals("aaaa")) {
				System.out.println("name = " + name);
			}else {
				System.out.println("name = null");
			}
		}catch(Exception e) {
			System.out.println("예외발생 : " +  e.getMessage());
		}
	}
}
public class Exam_13 {
	public static void main(String[] args) {
		
		Sawon sa = new Sawon();
		sa.print();
	}

}
