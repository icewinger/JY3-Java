package com.neuedu.Test01;

import java.util.Scanner;

public class AddMissage {
	String name;
	String sex;
	int age;
	String cls;
	String address;
	String nums;
	String email;
	int a;

	public AddMissage() {
		int b = 1;
		String[] num = new String[11];
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入学生id");
		do {
			a = sca.nextInt();
			if (a == 3) {
				System.out.println("此id3存在,请重新输入:");
			}
		} while (a == 3);
		System.out.println("请输入学生姓名:");
		name = sca.next();
		System.out.println("请输入学生性别:");
		sex = sca.next();
		do {
			System.out.println("请输入学生年龄(只能1-120之间内的数字):");
			age = sca.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("输入有误，,请重新输入");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("请输入学生所属年级(只能初级、中级、高级):");
			
			cls = sca.next();
			
			System.out.println(cls);
			if (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级"))) {
				System.out.println("输入有误，,请重新输入");
			}
		} while (false == (cls.equals("初级") || cls.equals("中级") || cls.equals("高级")));
		System.out.println("请输入学生地址:");
		address = sca.next();
		do {
			System.out.println("请输入学生联系方式(11位手机号码):");
			nums = sca.next();
		} while (nums.length() <num.length||nums.length() >num.length);
		System.out.println("请输入学生电子邮箱(包含@和.com):");
		email = sca.next();
		System.out.println("数据保存成功,系统将自动返回上层目录~");
	}

}
