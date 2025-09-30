package exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

//로또
public class Exam_06 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet();
		Random r = new Random();
		
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;//0 ~ 44
			lotto.add(num);
		}
		System.out.println("lotto : " + lotto);
		//오름차순 정렬
		List sLotto = new ArrayList(lotto);
		Collections.sort(sLotto);
		System.out.println("lotto : " + sLotto);
	}

}
