package com.neuedu.Student;

import java.util.Scanner;

public class Change {
	public Change()
	{
		int i =1;
		do {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息                    2.根据ID修改学生部分信息                    3.返回上级目录                    4.系统退出");
		System.out.println("----------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择:");
		int id = scanner.nextInt();
		if (id==1) {
			i=2;
			break;
		}
		if (id==4) {
			System.exit(0);
		}
		System.out.println("请输入要选择的id:");
		int id1 = scanner.nextInt();
		System.out.println("请输入要修改的属性:");
		String age = scanner.next();
		System.out.println("请输入修改后的数据:");
		int age2 = scanner.nextInt();
		System.out.println("修改成功");
		System.out.println("系统自动返回上层目录.......");
		}while(i==1);
		if(i==2) {
		do {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+  1.查看所有学生信息          2.根据id查询学生信息          3.根据id查询学生姓名          4.返回上一层          +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Scanner sca = new Scanner(System.in);
		System.out.println("请选择菜单:");
		int a = sca.nextInt();
		System.out.println("请输入要查询的id:");
		int id = sca.nextInt();
		if(id==3) {
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("|学号          |姓名          |年龄          |性别          |年级          |电话                                        |EMAIL                     |地址                                             ");
		System.out.println("|3     |张三          |100   |男              |中级          |123456789122    |zhangsan@qq.com           |北京市昌平区龙旗广场             ");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("数据查询完毕，系统将自动返回目录.......");
		}
		}while(i==2);
		}
}
}