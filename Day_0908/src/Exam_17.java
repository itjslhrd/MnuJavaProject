
public class Exam_17 {
	public static void main(String[] args) {
		int sw=1;
		for(int i=1; i<=10; i++) {
			if(sw==1) {
				System.out.println("홀수 : " +  i);
				sw=0;
			}else {
				System.out.println("짝수 : " + i);
				sw=1;
			}
		}

		boolean flag = true;
		for(int i=1; i<=10; i++) {
			if(flag) {
				System.out.println("홀수 : " +  i);
				flag=false;
			}else {
				System.out.println("짝수 : " +  i);
				flag=true;
			}
		}
	}

}
