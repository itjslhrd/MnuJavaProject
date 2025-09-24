package exam01;
//10진수 2진수 변환
public class Exam_07 {
	public static void main(String[] args) {
		int dec = 25;
		StringBuffer bin = new StringBuffer();
		while(dec != 0) {
			int na = dec % 2;
			bin.append(na);
			dec = dec / 2;
		}
		System.out.println("22진수 : " + bin);
		bin.reverse();
		System.out.println("22진수 : " + bin);
	}

}
