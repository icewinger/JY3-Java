package com.neuedu.test;

import java.sql.Connection;
import java.util.List;

import com.neuedu.dao.StudentDao;
import com.neuedu.dao.StudentDaoimpl;
import com.neuedu.entity.Student;
import com.neuedu.util.DBUtils;

public class Test {
	public static void main(String[] args) {
		Connection connection = DBUtils.getConnection();
		StudentDao sd = new StudentDaoimpl(connection);
	//	Student student = new Student("stu11","ÍõÓ¢À¤",250,"ÄÐ");
		List<String> courseInfoByStuId = sd.getCourseInfoByStuId("stu11");
		System.out.println(courseInfoByStuId);
		sd.upDateOneStudent("stuAge","290", "stu11");
		
	}
}
