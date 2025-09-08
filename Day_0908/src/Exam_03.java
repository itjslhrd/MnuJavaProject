import java.util.Scanner;
//A->65, a->97, 0->48
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("문자입력:");
		char ch = (char)scn.nextInt();
		if(ch>='A' && ch<='Z') {
			System.out.println("Pass" + ch);
		}else {
			System.out.println("NoPass" + ch);
		}
		
		if(ch>=65 && ch<=90) {//A->65, Z->90
			System.out.println("Pass" + ch);
		}else {
			System.out.println("NoPass" + ch);
		}
		
	}

}
