package com.neuedu.relection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RelectDeom {
	public static void main(String[] args) {
		//获取反射对象的对一种方式

			//完全限定名=包名+类名
			Class stu;
			try {
				stu = Class.forName("com.neuedu.relection.Student");
//				String name = stu.getName(); 
//				System.out.println(name);
				//获取类名
//				String  simpleName= stu.getSimpleName();
//				System.out.println(simpleName);
				//获取属性
				Field[] declaredFields = stu.getDeclaredFields();
				for (Field field : declaredFields) {
					System.out.println("类型"+field.getType());
					System.out.println("name"+field.getName());
				}
				//拿到所有声明的方法
				System.out.println("==========================================");
				Method[] declaredMethods = stu.getDeclaredMethods();
				for (Method method : declaredMethods) {
					System.out.print("修饰符"+method.getModifiers()+"返回值类型"+method.getReturnType()+"方法名"+method.getName()+"参数列表"+Arrays.toString(method.getParameters()));
					System.out.println();
				}
				//拿到构造器
				Constructor[] constructors = stu.getConstructors();
				for (Constructor constructor : constructors) {
					System.out.print("修饰符"+constructor.getModifiers()+"方法名"+constructor.getName()+"参数列表"+Arrays.toString(constructor.getParameters()));
					System.out.println();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
			//第二种获取class对象的方式
//			Class<Student> stu = Student.class;
//			System.out.println(stu.getName());
			
			//第三种获取class对象的方式
//			Student student = new Student();
//			Class<? extends Student> stu2 = student.getClass();
	}
}
