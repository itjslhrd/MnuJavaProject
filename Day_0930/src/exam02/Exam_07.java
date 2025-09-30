package exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam_07 {
	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList();
		
		for(int i=1; i<=45; i++) {
			lotto.add(new Integer(i));
		}
		//확인
		System.out.println("확인 : " + lotto);
		
		//섞기
		Collections.shuffle(lotto);
		//확인
		System.out.println("확인 : " + lotto);
		for(int i=0; i<6; i++) {
			System.out.print(lotto.get(i) + "  ");
		}
		
	}

}
