package exam01;

import java.util.HashMap;
import java.util.Map;

public class Exam_01 {
	public static void main(String[] args) {
		//객체 생성
		Map<String, Integer> map = new HashMap();
		
		//비어있는지
		boolean bool = map.isEmpty();
		System.out.println("map 비어있는가 ? " + bool);
		//저장
		map.put("A", 90);//키, 값
		map.put("B", 80);//키, 값
		map.put("C", 90);//키, 값
		map.put("A", 88);//키, 값
		
		// 확인
		System.out.println("확인 : " + map);
		//객체 수
		int count = map.size();
		System.out.println("객체 수 : " + count);
		
		//키가 포함되어 있는가?
		System.out.println("key-> B " + map.containsKey("B"));
		
		//값이 포함되어 있는가?
		System.out.println("value-> 80 " + map.containsValue(80));
		
		//키을 이용한 값을 검색
		int value = map.get("A");
		System.out.println("a -> : " + value);
		
	}

}
