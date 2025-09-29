package exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_03 {
	public static void main(String[] args) {
		List list = new ArrayList();//Object 타입
		list.add(123);
		list.add("AAAA");
		list.add(3.14);
		
		//지넥릭 타입
		List<String> sList = new ArrayList<String>();//문자열 전용
		sList.add("김학생");
		//List.add(3.14);
		sList.add("이학생");
		sList.add("박학생");
		sList.add("강학생");
		sList.add("홍학생");
		
		//객체 확인
		System.out.println("전체 객체 : " + sList);
		//1번 객체 변경
		sList.set(1, "최학생");
		System.out.println("전체 객체 : " + sList);
		//3번 객체 출력
		System.out.println("3번 객체 : " + sList.get(3));
		//2번 객체 삭제
		String name = sList.remove(2);
		System.out.println("전체 객체 : " + sList);
		System.out.println("객체이름 : " + name);
		
		boolean bool = sList.remove("홍길동");
		System.out.println("삭제유무 : " + bool);
		
	}

}
