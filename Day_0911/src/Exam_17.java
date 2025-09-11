
public class Exam_17 {
	public static void main(String[] args) {
		int var[]= {70,90,80,85,77,59,65,88,90,70,50};
		//전체 데이터 출력 후 80이상 데이터 수 출력
		int cnt=0;
		System.out.print("Data:");
		for(int i=0; i<var.length; i++) {
			System.out.printf("%5d", var[i]);
			if(var[i]>=80) {
				cnt++;
			}
		}
		
		System.out.print("\n");
		System.out.print("80이상 데이터 수 : " + cnt);
		
	}

}
