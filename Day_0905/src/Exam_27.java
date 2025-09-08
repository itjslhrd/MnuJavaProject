
public class Exam_27 {
	public static void main(String[] args) {
		int var[] = {70,90,40,60,30,80,10,55,57,78};
		//배열 요소 출력
		System.out.print("Data : ");
		for(int i=0; i<var.length;i++) {
			System.out.print(var[i]+" ");
		}
		System.out.print("\n");
		
		int max = var[0];//최대
		int min = var[0];//최소
		//int sum = var[0];//합계
		for(int i=0; i<var.length;i++) {
			if(max < var[i]) {
				max = var[i];
			}
			if(min > var[i]) {
				min=var[i];
			}
		}
		System.out.println("최대점수 : " +  max);
		System.out.println("최소점수 : " +  min);
	}

}
