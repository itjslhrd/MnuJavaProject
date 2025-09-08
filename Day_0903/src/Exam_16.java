
public class Exam_16 {
	public static void main(String[] args) {
		int a=3750;
		int mok = a / 1000;
		System.out.println("1000 :" + mok);
		a = a % 1000;//750
		mok = a / 500;
		System.out.println("500 :" + mok);
		a = a % 500;//250
		mok = a / 100;
		System.out.println("100 :" + mok);
		a = a % 100;
		mok = a / 50;
		System.out.println("50 :" + mok);
	}

}
