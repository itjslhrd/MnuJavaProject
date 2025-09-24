package exam01;
class AA{
	
}
class SubAA extends AA{
	
}
public class Exam_04 {
	public static void main(String[] args) {
		AA a1 = new SubAA();
		
		SubAA sa;
		if(a1 instanceof SubAA) {
			System.out.println("OK");
			sa = (SubAA)a1;//다운케스팅
		}else {
			System.out.println("NO");
		}
		

	}

}
