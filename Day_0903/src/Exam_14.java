//증감연산자(++, --)
public class Exam_14 {
	public static void main(String[] args) {
		int a=5,b;
		b=a++;
		System.out.println("a=" + a);//6
		System.out.println("b=" + b);//5
		a++;//7
		b=a++;
		System.out.println("a=" + a);//8
		System.out.println("b=" + b);//7
	}

}
