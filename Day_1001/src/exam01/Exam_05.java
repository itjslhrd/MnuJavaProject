package exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Man{
	int bun;
	String name;
	Man(){}
	Man(int bun,String name){
		this.bun=bun;
		this.name=name;
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Map<Man,Integer> mem = new HashMap();
		Man m = new Man(1,"김학생");
		mem.put(m, 90);
		
		mem.put(new Man(2,"강학생"), 88);
		mem.put(new Man(3,"오학생"), 80);
		mem.put(new Man(4,"박학생"), 95);
		
		m = new Man(5,"김학생");
		mem.put(m, 77);
		
		//학생수
		System.out.println("객체수 : "  + mem.size());
		//키 추출
		Set<Man> keys = mem.keySet();
		System.out.println("번호\t이름\t점수");
		for(Man mm : keys) {
			//System.out.print(mm);//주소 출력
			System.out.print(mm.bun + "\t" + mm.name + "\t");
			int score = mem.get(mm);
			System.out.print(score+"\n");
		}
	}
}
