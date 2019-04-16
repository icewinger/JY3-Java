package com.neuedu.fengzhuang;

public class Person {
	private int age;
	private String name;
	//设置年龄
	public void setAge(int age) {
		if (age<0||age>150) {
			System.out.println("输入有误");
		} 
		else
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
