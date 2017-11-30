package edu.wust.JDBC.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import edu.wust.JDBC.*;
import edu.wust.JDBC.model.*;

import edu.wust.JDBC.myConn;
import edu.wust.JDBC.model.student;

public class studentService {
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	
	
	public ArrayList<student> findAll() throws SQLException{	
		ArrayList<student> list=new ArrayList<student>();		
		String sql2="select * from student";
		
	    try {
	    	conn=myConn.getConn();
			stmt= conn.createStatement();
			rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				student s=new student();
				s.setStudentNo(rs.getString("studentNo"));
				s.setStudentName(rs.getString(2));
				list.add(s);								
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs!=null) rs.close();		
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
		}
	   return list;
	    
	}
	
	
	public student getByStudentNo(String No) throws SQLException{
		
		student s =new student(); 
		
		try {								
			conn=myConn.getConn();
			
			///////    PreparedStatement  //////////
			String sql2="select * from student where studentNo=?";
		    pstmt= conn.prepareStatement(sql2);
		    pstmt.setString(1,No);
		    rs = pstmt.executeQuery();		
			
			while (rs.next()) {
				s.setStudentNo(rs.getString("studentNo"));
				s.setStudentName(rs.getString(2));
				//s.setStudentName(rs.getString("studentName"));
				
			}
		} catch (SQLException  e) {
			e.printStackTrace();
		}
		finally{
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();		
			if(conn!=null) conn.close();			
		}
		return s;
	}
	

}
