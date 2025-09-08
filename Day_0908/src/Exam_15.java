// 1+2+3+4+5=15
public class Exam_15 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=5; i++) {
			if(i!=5) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"=");
			}
			s=s+i;
		}
		System.out.print(s);
	}

}
