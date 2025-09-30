package exam02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exam_05 {
	public static void main(String[] args) {
		Set<String> sSet = new HashSet();
		sSet.add("이학셍");
		sSet.add("강학셍");
		sSet.add("박학셍");
		sSet.add("최학셍");
		sSet.add("김학셍");
		
		//객체 출력(확장 for)
		System.out.println("--- 확장 for() ---");
		for(String str : sSet) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		////객체 출력(반복자(Iterator))
		System.out.println("--- 반복자(Iterator) ---");
		Iterator<String> iter = sSet.iterator();
		while(iter.hasNext()) {//존재하면
			String ss = iter.next();// 꺼내오기
			System.out.print(ss + "\t");
		}
		System.out.println();
		//리스트로 변환 후
		System.out.println("--- 리스트 변환 ---");
		List<String> sList = new ArrayList(sSet);
		for(int i=0; i<sList.size(); i++) {
			System.out.print(sList.get(i) + "\t");
		}
				
		
		
	}

}
