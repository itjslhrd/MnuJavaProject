package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam_02 {
	public static void main(String[] args) throws Exception{
		//1. 드라이버 로딩
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnu?serverTimezone=UTC","root","webs0100");

		//명령문 처리
		Statement stmt = conn.createStatement();		
		ResultSet rs = stmt.executeQuery("select eno,ename,hiredate,salary,salary*12 tot from emp");
		
		PreparedStatement pstmt = conn.prepareStatement("sql");
		rs = pstmt.executeQuery();
		

		System.out.println("번호\t이름\t입사일자\t급여\t연봉");
		while(rs.next()) {
			System.out.print(rs.getInt("eno") + "\t");
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getString("hiredate") + "\t");
			System.out.print(rs.getInt("salary") + "\t");
			System.out.print(rs.getInt("tot") + "\n");
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
