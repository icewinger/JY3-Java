package com.neuedu.Student;

import java.util.Scanner;

public class Loading {
	public Loading() {
		int j = 1;
		int a;
		while (j == 1) {
			System.out.println("----------��ӭ��¼ѧ������ϵͳ----------");
			Scanner sca = new Scanner(System.in);
			System.out.println("1.��¼             2.�˳�");
			System.out.println("---------------------------------");
			a = sca.nextInt();
			switch (a) {
			case 1: {
				j = 2;
				System.out.println("��ӭ��¼");
				while (1 == 1) {
					Scanner scan = new Scanner(System.in);
					System.out.println("�������û���");
					String name = scan.next();
					System.out.println("����������");
					String password = scan.next();
					if (name.equals("admin") && password.equals("admin")) {
						System.out.println("��½�ɹ�" + "\n");
						System.out.println("��ӭ��," + name);
						break;
					} else {
						System.out.println("�˺������������������");
						break;
					}
				}

			}
			case 2:
				if(a==2)
				{
					System.exit(0);
				}
				break;

			default: {
				System.out.println("��������,����������");
				break;
			}
			}
		}
	}
}
