import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input : ");
		int bun = scn.nextInt();//bun
		String name = scn.next();//name
		int kor = scn.nextInt();//kor
		int eng = scn.nextInt();//eng
		int mat = scn.nextInt();//mat
		
		int tot = kor + eng + mat;
		double ave = tot / 3.0;
		
		System.out.println("bun=" + bun);
		System.out.println("name=" + name);
		System.out.println("tot=" + tot);
		System.out.println("ave=" + ave);
		
		System.out.println("bun\tname\ttot\tave");
		//System.out.println(bun + "   " + name + "   " + tot + "   " + ave);
		//System.out.println(bun + "\t" + name + "\t" + tot + "\t" + ave);
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\n");
		//System.out.println(ave);
		
		
	}

}
