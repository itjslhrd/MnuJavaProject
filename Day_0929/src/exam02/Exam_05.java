package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//키보드로 10명의 이름을 입력 리스트에 정장 후 출력
//단. 동일한 이름은 한번만 입력
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> nList = new ArrayList<String>();
		while(nList.size()<10) {
			System.out.print("이름:");
			String name = scn.next();
			if(nList.contains(name)) {
				System.out.println("이미 등록된 이름입니다.");
			}else {
				nList.add(name);
			}
		}
		//출력
		for(String s : nList) {
			System.out.println(s);
		}
	}

}
