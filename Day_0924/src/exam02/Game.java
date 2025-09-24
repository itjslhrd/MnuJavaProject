package exam02;

import java.util.Scanner;

//가위바위보
public class Game {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int ch = 0;// 사용자
		int com = 0;// 컴퓨터(random())
		while(true) {
			System.out.print("1:가위, 2:바위, 3:보, 4:종료 ? "  );
			ch = System.in.read()-'0';//사용자 입력
			System.in.read();
			System.in.read();
			if(ch<1 || ch>4) {
				System.out.println("잘목입력했습니다");
				continue;
			}
			if(ch==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			com =((int)(Math.random()*3))+1;//컴퓨터
			System.out.println("사용자는 " + ((ch==1)? "가위": (ch==2) ? "바위":"보"));
			System.out.println("컴퓨터는 " + ((com==1)? "가위": (com==2) ? "바위":"보"));
			
			System.out.println();
			switch(ch*com) {
			case 2:
				System.out.println(((ch>com)? "사용자":"컴퓨터")+"가 이겼습니다");
				break;
			case 3:
				System.out.println(((ch>com)? "컴퓨터":"사용자")+"가 이겼습니다");
				break;				
			case 6:
				System.out.println(((ch>com)? "사용자":"컴퓨터")+"가 이겼습니다");
				break;				
			default:
				System.out.println("비겼습니다");
			}
		}
		
	}

}
