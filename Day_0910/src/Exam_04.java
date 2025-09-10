import java.util.Arrays;

public class Exam_04 {
	static void SelectionSortAsc(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	static void BubbleSortDesc(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int score[] = {90,70,80,95,66,78,85,90};
		int a[] = score.clone();
		
		SelectionSortAsc(a);
		
		System.out.println("Sort 전 : " +  Arrays.toString(score));
		System.out.println("Sort 후 : " +  Arrays.toString(a));
		
		BubbleSortDesc(a);
		System.out.println("Sort 전 : " +  Arrays.toString(score));
		System.out.println("Sort 후 : " +  Arrays.toString(a));
		
	}

}
