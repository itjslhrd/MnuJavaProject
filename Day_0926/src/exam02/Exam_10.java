package exam02;

import java.text.DecimalFormat;

public class Exam_10 {

	public static void main(String[] args) {
		int money=1234567;
		//# 0 . ,
		DecimalFormat df = new DecimalFormat("###,###");
		String s1 = df.format(money);
		System.out.println(s1);
		df = new DecimalFormat("000,000");
		String s2 = df.format(money);
		System.out.println(s2);
		
		
	}

}
