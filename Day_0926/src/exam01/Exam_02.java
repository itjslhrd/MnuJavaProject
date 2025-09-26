package exam01;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

//파일로부터 읽어서 출력
public class Exam_02 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/data.txt"));
		StringTokenizer st;
		
		while(scn.hasNextLine()) {
			String str = scn.nextLine();
			st = new StringTokenizer(str,", ");
			int bun = Integer.parseInt(st.nextToken());//번호
			String name = st.nextToken();//이름
			int kor = Integer.parseInt(st.nextToken());//국어
			int eng = Integer.parseInt(st.nextToken());//영어
			int mat = Integer.parseInt(st.nextToken());//수학
			int tot = kor+eng+mat;
			double ave = tot / 3.;
			
			System.out.print(bun + "\t");
			System.out.print(name + "\t");
			System.out.print(kor + "\t");
			System.out.print(eng + "\t");
			System.out.print(mat + "\t");
			System.out.print(tot + "\t");
			System.out.print(String.format("%.2f",ave) + "\n");
		}
		
	}

}
