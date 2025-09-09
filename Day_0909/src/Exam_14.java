
public class Exam_14 {
	public static void main(String[] args) {
		int arr[];//배열의 선언
		arr = new int[5];//메모리 할당
		//인덱스 0 ~ 4
		System.out.println("arr=" + arr);
		System.out.println("arr[0] =" + arr[0]);
		
		//배열 요소에 값 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		arr[3] = arr[0]+arr[1]+arr[2];
		
		System.out.println("arr[0]= " + arr[0]);
		
		//전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
