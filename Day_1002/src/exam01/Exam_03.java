package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam_03 {
	public static void main(String[] args) throws Exception{
		//1. 드라이버 로딩
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnu?serverTimezone=UTC","root","webs0100");

		//명령문 처리	
		String sql="select eno,ename,hiredate,salary,\r\n"
				+ "      salary*12 tot from emp \r\n"
				+ "			order by eno desc";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		

		System.out.println("번호\t이름\t입사일자\t급여\t연봉");
		while(rs.next()) {
			System.out.print(rs.getInt("eno") + "\t");
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getString("hiredate") + "\t");
			System.out.print(rs.getInt("salary") + "\t");
			System.out.print(rs.getInt("tot") + "\n");
		}
		
		rs.close();
		pstmt.close();
		conn.close();
	}

}
