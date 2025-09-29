package exam01;

import java.util.ArrayList;
import java.util.List;

//Collection(자료구조) --> List --> 구현클래스 ArrayList
public class Exam_01 {
	public static void main(String[] args) {
		//size():크기(객체수), isEmpty() : 비어있는지
		//add():등록(삽입),remove():삭제,contains():포함유무
		//iterator(): 반복자
		List list = new ArrayList();
		
		boolean bool = list.isEmpty();
		System.out.println("bool = " + bool);
		//저장된 객체 수
		int count = list.size();
		System.out.println("count = " + count);
		
		// 데이터 추가
		list.add(1000);
		list.add("AAAA");
		list.add(3.14);
		list.add(true);
		list.add(3.14);
		
		count = list.size();
		System.out.println("count = " + count);
		
		//삭제
		list.remove(0);
		count = list.size();
		System.out.println("count = " + count);
	
		//포함유무
		System.out.println("contains() : " +  list.contains("AAAA"));
	}

}
