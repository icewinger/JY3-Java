package com.neuedu.Student;

import java.util.Scanner;

public class Loading {
	public Loading()
	{	
		int j = 1;
		while(j==1){
		System.out.println("----------��ӭ��¼ѧ������ϵͳ----------");
		Scanner sca = new Scanner(System.in);
		System.out.println("1.��¼             2.�˳�");
		System.out.println("---------------------------------");
		switch(sca.nextInt())
		{
		case 1:
		{
			j=2;
			System.out.println("��ӭ��¼");
			while(1==1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�������û���");
			String name = scan.next();
			System.out.println("����������");
			String password = scan.next();
			if(name.equals("admin")&&password.equals("admin"))
			{
				System.out.println("��½�ɹ�"+"\n");
				System.out.println("��ӭ��,"+name);
				break;
			}
			else
			{
				System.out.println("�˺������������������");
			}
			}
		}
		case 2:
			System.exit(0);
			j=2;
			return;
		
		default:
		{
			System.out.println("��������,����������");
			break;
		}
	}
	}
	}
}
