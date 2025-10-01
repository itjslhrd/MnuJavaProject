package exam02;

import java.util.LinkedList;
import java.util.Queue;

//Queue:인터페이스
public class Exam_08 {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		//비어있는가?
		System.out.println("비어있느가 " + que.isEmpty());
		//객체 수
		int cnt = que.size();
		//삽입
		que.add("aaa");
		que.offer("bbb");
		que.offer("ccc");
		que.offer("ddd");
		que.offer("eee");
		System.out.println("객체수 " + que.size());
		
		Object obj = que.poll();
		System.out.println("제거 : " + obj);
		
		while(!que.isEmpty()) {
			System.out.println("제거 : " + que.poll());
		}
		
	}

}
