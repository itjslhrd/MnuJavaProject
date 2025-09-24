package exam01;

public class Exam_06 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//기본크기 16
		StringBuffer sb2 = new StringBuffer(10);//기본크기 10
		StringBuffer sb3 = new StringBuffer("Korea");//기본크기 5+16=21
		
		System.out.println("sb1 : " + sb1.capacity());
		System.out.println("sb2 : " + sb2.capacity());
		System.out.println("sb3 : " + sb3.capacity());
		
		//append(): 추가, insert() : 삽입
		System.out.println("sb3 : " + sb3);
		sb3.append("Test");
		System.out.println("sb3 : " + sb3);
		sb3.insert(1, "Se");
		System.out.println("sb3 : " + sb3);
		//삭제 delete(시작, 전까지)
		sb3.delete(1, 3);
		System.out.println("sb3 : " + sb3);
		
		//특정 위치 삭제 deleteCharAt(0);//0번 삭제
		//특정위치 값 변경 : setCharAt(0,'S');
		//문자열 뒤집기 : reverse()
		

	}

}
