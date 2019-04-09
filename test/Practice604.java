package com.neuedu.homework;

import java.util.Arrays;

public class Practice604 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.f();
	}

}
class Student
{
	String[] name;
	int[] num;
	int[] grade;
	public Student()
	{
		name = new String[] {"ÍõÓ¢À¤","ÀîÔÆÁú","¿×½Ü","ºÍÉĞ","³şÔÆ·É"};
		num = new int[] {1,2,3,4,5};
		grade = new int[] {0,100,60,45,95};
	}
	public void f()
	{
		for (int i = 0; i < grade.length-1; i++) {
			for (int j =i+1; j < grade.length; j++) {
			if (grade[i]>grade[j]) {
				grade[i]=grade[i]+grade[j];
				grade[j]=grade[i]-grade[j];
				grade[i]=grade[i]-grade[j];
			}	
			}
		}
		System.out.println(Arrays.toString(grade));
	}
}