package com.neuedu.relection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RelectDeom {
	public static void main(String[] args) {
		//��ȡ�������Ķ�һ�ַ�ʽ

			//��ȫ�޶���=����+����
			Class stu;
			try {
				stu = Class.forName("com.neuedu.relection.Student");
//				String name = stu.getName(); 
//				System.out.println(name);
				//��ȡ����
//				String  simpleName= stu.getSimpleName();
//				System.out.println(simpleName);
				//��ȡ����
				Field[] declaredFields = stu.getDeclaredFields();
				for (Field field : declaredFields) {
					System.out.println("����"+field.getType());
					System.out.println("name"+field.getName());
				}
				//�õ����������ķ���
				System.out.println("==========================================");
				Method[] declaredMethods = stu.getDeclaredMethods();
				for (Method method : declaredMethods) {
					System.out.print("���η�"+method.getModifiers()+"����ֵ����"+method.getReturnType()+"������"+method.getName()+"�����б�"+Arrays.toString(method.getParameters()));
					System.out.println();
				}
				//�õ�������
				Constructor[] constructors = stu.getConstructors();
				for (Constructor constructor : constructors) {
					System.out.print("���η�"+constructor.getModifiers()+"������"+constructor.getName()+"�����б�"+Arrays.toString(constructor.getParameters()));
					System.out.println();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
			//�ڶ��ֻ�ȡclass����ķ�ʽ
//			Class<Student> stu = Student.class;
//			System.out.println(stu.getName());
			
			//�����ֻ�ȡclass����ķ�ʽ
//			Student student = new Student();
//			Class<? extends Student> stu2 = student.getClass();
	}
}
