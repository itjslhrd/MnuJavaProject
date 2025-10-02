package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam_01 {
	public static void main(String[] args) {
		//1. 드라이버 로딩
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnu?serverTimezone=UTC","root","webs0100");
			System.out.println("conn : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			// 명령문 수행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");//query 수행 후 결과 저장
			while(rs.next()) {//존재하면
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
			}
			//닫기
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
