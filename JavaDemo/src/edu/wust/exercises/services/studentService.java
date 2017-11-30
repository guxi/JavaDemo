package edu.wust.exercises.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import edu.wust.exercises.models.student;

public class studentService {
	final static ComboPooledDataSource ds = new ComboPooledDataSource("usualscore");
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	boolean hasStudent(student s) {

		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();

			String sql1 = "select * from student where id=" + s.getId();
			rs = stmt.executeQuery(sql1);
			if (rs.next())
				return true;

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
		}
		return false;
	}

	int saveStudents(List<student> students) {
		int i = -1;

		prtl("人数1：" + students.size());

		Iterator<student> iterator = students.iterator();
		while (iterator.hasNext()) {
			student s = iterator.next();

			if (hasStudent(s))
				iterator.remove(); //删除重复的
		}

		if (students.size() > 0) {
			try {
				conn = ds.getConnection();
				String sql = "insert into student(id,name,classname) values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				for (student s : students) {
					pstmt.setString(1, s.getId());
					pstmt.setString(2, s.getName());
					pstmt.setString(3, s.getClassName());
					// pstmt.setInt(4, courseInfoKey);
					pstmt.addBatch();
				}

				i = pstmt.executeBatch()[1];

				pstmt.close();
				conn.close();
				return i;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}
}
