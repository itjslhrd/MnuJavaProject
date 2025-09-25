package exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("data.txt"));
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t화학\t총점\t평균");
		while(scn.hasNextLine()) {
			String str = scn.nextLine();
			String arr[] = str.split(",");
			int tot = Integer.parseInt(arr[2])+
					Integer.parseInt(arr[3])+
					Integer.parseInt(arr[4])+
					Integer.parseInt(arr[5]);
			double ave = tot / 4.0;
			System.out.print(arr[0] + "\t");
			System.out.print(arr[1] + "\t");
			System.out.print(arr[2] + "\t");
			System.out.print(arr[3] + "\t");
			System.out.print(arr[4] + "\t");
			System.out.print(arr[5] + "\t");
			System.out.print(tot + "\t");
			System.out.print(ave + "\n");
		}
	}

}
