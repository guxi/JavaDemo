package edu.wust.exercises.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import edu.wust.exercises.models.courseInfo;

public class courseService {
	final static ComboPooledDataSource ds = new ComboPooledDataSource("usualscore");
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public boolean hasCourse(courseInfo ci) {
		prtl(""+ci.toString());
		String sql = "select * from courseinfo where Semester=? and CourseName=? and techer=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ci.getSemester());
			pstmt.setString(2, ci.getCourseName());
			pstmt.setString(3, ci.getTecher());
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public int save(courseInfo ci) {
		if (!hasCourse(ci))
			try {
				prtl("1111");
				String sql = "insert into courseinfo(Semester,CourseName,techer) values(?,?,?)";
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, ci.getSemester());
				pstmt.setString(2, ci.getCourseName());
				pstmt.setString(3, ci.getTecher());
				pstmt.executeUpdate();
				ResultSet rsKey = pstmt.getGeneratedKeys();
				rsKey.next();
				int key = rsKey.getInt(1); // 得到第一个键值
				//System.out.println(key);
				rsKey.close();
				pstmt.close();
				conn.close();
				return key;


			} catch (SQLException e) {
				e.printStackTrace();
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
