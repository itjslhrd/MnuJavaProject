//논리 연산자 :  &&(and),  ||(or)
public class Exam_10 {
	public static void main(String[] args) {
		System.out.println("7>=5 && 6>=7 : " + 
								(7>=5 && 6<=7));
		
		System.out.println("7>=5 || 6>=7 : " + 
								(7>=5 || 6>=7));
		
		System.out.println("7>=5 : "  + (7>=5));
		System.out.println("7>=5 : "  + !(7>=5));

	}

}
