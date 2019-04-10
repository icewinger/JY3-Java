package com.neuedu.Student;

import java.util.Scanner;

public class Loading {
	public Loading()
	{	
		int j = 1;
		while(j==1){
		System.out.println("----------欢迎登录学生管理系统----------");
		Scanner sca = new Scanner(System.in);
		System.out.println("1.登录             2.退出");
		System.out.println("---------------------------------");
		switch(sca.nextInt())
		{
		case 1:
		{
			j=2;
			System.out.println("欢迎登录");
			while(1==1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入用户名");
			String name = scan.next();
			System.out.println("请输入密码");
			String password = scan.next();
			if(name.equals("admin")&&password.equals("admin"))
			{
				System.out.println("登陆成功"+"\n");
				System.out.println("欢迎您,"+name);
				break;
			}
			else
			{
				System.out.println("账号密码错误请重新输入");
			}
			}
		}
		case 2:
			System.exit(0);
			j=2;
			return;
		
		default:
		{
			System.out.println("输入有误,请重新输入");
			break;
		}
	}
	}
	}
}
