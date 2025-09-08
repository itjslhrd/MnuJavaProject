
public class Exam_07 {
	public static void main(String[] args) {
		int kor=60,eng=60,mat=70;
		//합격조건 : 3과목 모두 40이상, 평균 60이상
		int ave = (kor+eng+mat)/3;
		
		if(kor>=40 && eng>=40 && mat>=40 && ave>=60) {
			System.out.println("Pass");
		}else {
			System.out.println("NoPass");
		}	
	}
}
