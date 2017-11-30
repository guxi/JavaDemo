package edu.wust.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myConn {
	private static Connection conn=null;
	public static Connection getConn(){
		try {
			//Class.forName("com.mysql.jdbc.Driver");			
			String url = "jdbc:mysql://localhost:3306/db_score";
			String user="root";
			String pass="809110";
			conn = DriverManager.getConnection(url,user,pass);
		
		} catch (SQLException  e) {
			e.printStackTrace();
		}
		return conn;		
	}
}
