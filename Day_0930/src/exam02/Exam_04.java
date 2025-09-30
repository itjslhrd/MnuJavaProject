package exam02;

import java.util.HashSet;
import java.util.Set;

//Set -> HashSet
public class Exam_04 {
	public static void main(String[] args) {
		Set set = new HashSet();
		//저장
		set.add("BBBB");		
		set.add("BBBB");
		set.add(1234);
		set.add(3.141592);
		set.add(false);
		
		// 확인
		System.out.println("확인 : " + set);
		//객체수
		System.out.println("객체 수 : " + set.size());
		//비어있는지 유무
		System.out.println("비어있는지 : " + set.isEmpty());
		//포함유무
		System.out.println("1234 포함유무 : " + set.contains(1234));
		//1234 삭제
		System.out.println("1234 삭제 : " + set.remove(1234));
		
		// 확인
		System.out.println("확인 : " + set);
		
	}

}
