import java.util.Arrays;

public class Exam_22 {
	public static void main(String[] args) {
		int temp[] = {56,90,77,80,69,95,85,78,93,85,89};
		//temp 배열에서 80이상 점수만 출력
		System.out.println("Dara : " + Arrays.toString(temp));
		
		int cnt=0;
		int sum=0;
		System.out.print("80이상 Data : ");
		for(int i=0; i<temp.length; i++) {
			if(temp[i]>=80) {
				System.out.printf("%5d", temp[i]);
				cnt++;
				sum += temp[i];//sum=sum+temp[i]
			}
		}
		System.out.print("\n");
		System.out.println("80이상 Data 수 : " +  cnt);
		System.out.println("80이상 Data 합 : " +  sum);
	}

}
