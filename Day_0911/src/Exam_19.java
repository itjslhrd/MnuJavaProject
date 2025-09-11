
public class Exam_19 {

	public static void main(String[] args) {
		int var[]= {70,90,80,85,77,59,65,88,90,70,50};
		//80이상 데이터를 배열에 저장 후 출력
		
		//80이상 데이터 수 카운트
		int cnt = 0;
		for(int i=0; i<var.length; i++) {
			if(var[i]>=80) {
				cnt++;
			}
		}
		int value[] = new int[cnt];
		int x=0;
		for(int i=0; i<var.length; i++) {
			if(var[i]>=80) {
				value[x] = var[i];
				x++;
			}
		}
		
		System.out.print("Data :");
		for(int i=0; i<value.length; i++) {
			System.out.printf("%5d", value[i]);
		}
	}

}
