package edu.wust.JDBC;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.wust.JDBC.model.student;
import edu.wust.JDBC.services.studentService;


public class DBTest2 {

	public static void main(String[] args) {
		studentService service = new studentService();
		
		// ///////////getByStudentNo///////
		
		 try { 
			 student s = service.getByStudentNo("0700004");
			 System.out.println(s.getStudentNo());
			 System.out.println(s.getStudentName());
		 } catch (SQLException e){
			 e.printStackTrace(); 
		 } 		 

		////////////// findAll /////////
		try {
			ArrayList<student> list = service.findAll();
			for (student s1 : list) {
				System.out.println(s1.getStudentNo());
				System.out.println(s1.getStudentName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
