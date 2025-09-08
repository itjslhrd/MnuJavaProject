// 1 ~ 5 합계
public class Exam_13 {

	public static void main(String[] args) {
		//for()
		int sum = 0;//합(1+2+3+4+5)
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			sum = sum + i;//sum += i;
		}
		System.out.println(sum);
		//while()
		int x=1;
		int tot=0;
		while(x<=5) {
			System.out.println(x);
			tot=tot+x;
			x++;
		}
		System.out.println(tot);
		
		int k=0;
		int s=0;
		while(k<5) {
			k++;
			s = s + k;
			System.out.println(k);
		}
		System.out.println(s);
	}

}
