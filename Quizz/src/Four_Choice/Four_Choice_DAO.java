package Four_Choice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Four_Choice_DAO {
	
	String DRIVER_NAME	= "com.mysql.cj.jdbc.Driver";
	String JDBC_URL		= "jdbc:mysql://localhost/quizz?characterEncoding=UTF-8&serverTimezone=JST&useSSL=false";
	String User_ID		= "test_user";
	String User_PASS	= "test_pass";
	
	//idに応じたDBを呼び出すメソッド
	public Four_Choice_DTO Select_quizz(int id) {
		
		try {
			Class.forName(DRIVER_NAME);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection			con	= null;
		PreparedStatement	ps	= null;
		ResultSet			rs	= null;
		
		Four_Choice_DTO		dto = null;
		
		try {
			con	=	DriverManager.getConnection(JDBC_URL, User_ID, User_PASS);
			
			StringBuffer buf = new StringBuffer();
			
			
			buf.append("  SELECT        "); 
			buf.append("  id,           ");
			buf.append("  problem,      ");
			buf.append("  choice1,      ");
			buf.append("  choice2,      ");
			buf.append("  choice3,      ");
			buf.append("  choice4       ");
			buf.append("  FROM          ");
			buf.append("  Four_Choice   ");
			buf.append("  WHERE         ");
			buf.append("  id = ?        ");
			
			ps	= con.prepareStatement(buf.toString());
			
			ps.setInt(1,id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new Four_Choice_DTO();
				dto.setID	(rs.getInt("id"));
				dto.setPb	(rs.getString("problem"));
				dto.setC1	(rs.getString("Choice1"));
				dto.setC2	(rs.getString("Choice2"));
				dto.setC3	(rs.getString("Choice3"));
				dto.setC4	(rs.getString("Choice4"));
				dto.setAns	(rs.getString("Choice1"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return dto;
	}
}
