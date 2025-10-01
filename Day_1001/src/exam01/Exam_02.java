package exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam_02 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "김학생");
		map.put(2, "이학생");
		map.put(3, "강학생");
		map.put(4, "홍학생");
		map.put(5, "김학생");
		//전체 확인
		System.out.println("전체 확인 : " +map);
		
		//키 추출 
		Set<Integer> key = map.keySet();
		System.out.println("key : " + key);
		//확장 for()
		for(Integer ikey : key) {
			System.out.print("key : " + ikey);
			System.out.print("value : " + map.get(ikey) + "\n");
		}
		System.out.println("--------------------");
		//키 값을 반복자 변환
		//Set<Integer> key = map.keySet();
		Iterator<Integer> iter = key.iterator();
		while(iter.hasNext()) {
			int k = iter.next();//키
			//System.out.print(k + "\t");
			//String v = map.get(k);
			//System.out.print(v + "\n");
			System.out.println(k + "\t" + map.get(k));
		}
		
		
	}

}
