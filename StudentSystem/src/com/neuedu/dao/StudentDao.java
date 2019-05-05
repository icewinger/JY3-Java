package com.neuedu.dao;



import java.util.List;

import com.neuedu.entity.Course;
import com.neuedu.entity.Student;
/**
 * ѧ���ӿ�
 * @author Administrator
 *
 */
public interface StudentDao {
	
	//���ѧ��
	void addOneStudent(Student student);
	
	//�޸�ѧ��
	void upDateOneStudent(Object object,Object object2,String id);

	//ɾ��ѧ��
	void delOneStudent(String stuId);
	
	//��ѯ����ѧ��
	List<Student> getAllStudent();
	
	//����ID��ѯѧ��
	Student getStudentInFoBystuId(String stuId);
	
	//����ѧ��ѧ�Ų�ѯ�γ���Ϣ
	List<String> getCourseInfoByStuId(String stuId);
}
