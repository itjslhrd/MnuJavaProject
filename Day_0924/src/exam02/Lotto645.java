package exam02;

import java.util.Arrays;

public class Lotto645 {
	public static void main(String[] args) {
		int lotto[] = new int[6];	
		// 중복제거
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;//1 ~ 45
			//중복제거
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Lotto : " + Arrays.toString(lotto));
		//오름차순 정렬
		Arrays.sort(lotto);
		System.out.println("Lotto : " + Arrays.toString(lotto));
		
	}

}
