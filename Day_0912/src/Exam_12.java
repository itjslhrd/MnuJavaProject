//2차원 배열

import java.util.Arrays;

public class Exam_12 {
	public static void main(String[] args) {
		//int var[][] = new int[2][3];
		int var[][] = {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("var : " + Arrays.toString(var));
		System.out.println("var[0] : " + Arrays.toString(var[0]));
		System.out.println("var[1] : " + Arrays.toString(var[1]));
		
		System.out.println("row : " + var.length);
		System.out.println("col : " + var[0].length);
		
		for(int i=0; i<var.length; i++) {
			System.out.printf("var[%d] : %s\n", i, Arrays.toString(var[1]));
		}
	}

}
