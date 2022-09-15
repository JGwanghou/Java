package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 	날짜 : 2022/09/15
 * 	이름 : 조광호
 * 	내용 : JDBC Delete 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
		
			// 3단계 - SQL 객체 생성
			Statement stmt = conn.createStatement();
			// 4단계 - SQL 실행
			String sql = "DELETE FROM `User1` WHERE `uid` = 'j101';";
			stmt.executeUpdate(sql);
			// 5단계 - Select 결과처리
			
			// 6단계 - 데이터베이스 종료
			conn.close();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("DELETE 완료..");
	}
}
