package com.neuedu.set;

public class ObjectCompare {
	public static void main(String[] args) {
		Student student = new Student("张三",15);
		Student student2 = new Student("张三",15);
		System.out.println(student.equals(student2));
		
	}
}
