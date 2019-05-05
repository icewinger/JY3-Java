package com.neuedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.entity.Student;
/**
 * 接口的实现
 * @author Administrator
 *
 */
public class StudentDaoimpl implements StudentDao {
	//Connection的成员变量
	private Connection conn;
	public StudentDaoimpl(Connection conn) 
	{
		this.conn = conn;
		
	}
	//添加学生
	@Override
	public void addOneStudent(Student student) {
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStuId());
			pstmt.setString(2, student.getStuName());
			pstmt.setInt(3, student.getStuAge());
			pstmt.setString(4, student.getStuSex());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//修改学生
	@Override
	public void upDateOneStudent(Object object,Object object2,String id) {
		String sql = "UPDATE student set " + object + " = ? where stuId = ?";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setObject(1, object2);
			pre.setString(2, id);
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delOneStudent(String stuId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentInFoBystuId(String stuId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//通过学生学号查询课程信息
	@Override
	public List<String> getCourseInfoByStuId(String stuId) {
		List<String> courseName = new ArrayList<>();
		String sql = "SELECT courseName FROM stuAndCourse JOIN course ON cId = courseId WHERE sId = ?";
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, stuId);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next())
			{
				String string = rs.getString("courseName");
				courseName.add(string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courseName;
	}

}
