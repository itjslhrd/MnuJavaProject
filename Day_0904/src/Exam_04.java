import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name1 = scn.next();
		String name2 = scn.nextLine();
		String name3 = scn.next();
		
		System.out.println("이름 = " +  name1);
		System.out.println("이름 = " +  name2);

	}

}
