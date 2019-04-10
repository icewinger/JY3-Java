package com.neuedu.Student;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//	Loading loading = new Loading();
	int i=1;
	while(i==1) {
	System.out.println("***************************************************************");
	System.out.println("*1.查看学生信息          2.添加学生信息          3.删除学生信息          4.修改学生信息          5.退出          *");
	System.out.println("***************************************************************");
	Scanner sca = new Scanner(System.in);
	System.out.println("请选择");
	switch (sca.nextInt())
	{
	case 1:
	{
		break;
	}
	case 2:
	{
		AddMissage addMissage = new AddMissage();
		break;
	}
	case 3:
	{
		break;
	}
	case 4:
	{
		break;
	}
	case 5:
	{
		i = 2;
		break;
	}
	default:
	{System.out.println("输入错误请重新输入");
	break;
	}
	}
	
}
}
}
