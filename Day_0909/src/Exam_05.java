import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여:");
		int pay = scn.nextInt();
		int money = 50000;
		boolean bool = true;
		while(pay > 0) {
			System.out.print(money + " : ");
			int mok = pay / money;
			System.out.println(mok);
			pay = pay % money;
			if(bool) {
				money = money / 5;
				bool = false;
			}else {
				money = money / 2;
				bool = true;
			}
		}
	}
}
