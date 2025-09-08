//배열:동일한 이름을 가진 기억공간
public class Exam_23 {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println(a);//주소
		System.out.println(a[0]);//0
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//a[5]=600;
		
		System.out.println(a[0]);		
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}

}
