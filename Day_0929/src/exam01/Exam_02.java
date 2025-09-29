package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_02 {
	public static void main(String[] args) {
		List sList = new ArrayList();
		ArrayList aList = new ArrayList();
		
		sList.add("김학생");
		sList.add(1234);
		sList.add("박학생");
		sList.add("최학생");
		sList.add("김학생");
		// 확인
		System.out.println(sList);
		//List Data 출력 --> get()
		//1.기본 for()
		for(int i=0; i<sList.size(); i++) {
			//Object -> String 강제 형변환
			//String str = (String)sList.get(i);
			Object str = sList.get(i);
			System.out.println(str);
		}
		System.out.println("-------------------");
		//확장 for
		for(Object obj : sList) {
			System.out.println(obj);
		}
		
		//반복자 iterator()
		Iterator iter = sList.iterator();
		System.out.println("--------------------");
		while(iter.hasNext()) {//존재하면
			Object ss = iter.next();
			System.out.println(ss);
			
		}
	}

}
