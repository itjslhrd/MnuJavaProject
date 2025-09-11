import java.util.Arrays;
import java.util.Random;

public class Lotto645 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			//중복검사
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(lotto));
		//오름차순 정렬
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int imsi = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = imsi;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
	}

}
