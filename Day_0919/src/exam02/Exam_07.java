package exam02;
interface CC{
	void add(int ... a);
}
class SubCC implements CC{
	@Override
	public void add(int... a) {
		int s=0;
		for(int i=0; i<a.length; i++) {
			s += i;
		}
		System.out.printf("%d ~ %d 합 :  %d\n", a[0],a[a.length-1],s);
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		CC c1 = new SubCC();
		c1.add(1,2,3,4,5,6,7,8,9,10);
	}

}
