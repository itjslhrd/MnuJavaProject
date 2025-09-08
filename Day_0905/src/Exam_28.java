//체조경기 채점
//7개의 점수중 최대, 최소를 뺀 합계 구하기
public class Exam_28 {
	public static void main(String[] args) {
		int val[] = {8,9,5,10,9,7,8};
		int max = val[0];
		int min = val[0];
		int sum = val[0];
		//int sum = 0;
		for(int i=1; i<val.length; i++) {
			if(max < val[i]) {//최대
				max = val[i];
			}else if(min > val[i]) {//최소
				min = val[i];
			}
			sum += val[i];//합계
		}
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합계 : " + (sum-max-min));
		
	}

}
