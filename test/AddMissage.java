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
		System.out.println("������ѧ��id");
		do {
			a = sca.nextInt();
			if (a == 3) {
				System.out.println("��id3����,����������:");
			}
		} while (a == 3);
		System.out.println("������ѧ������:");
		name = sca.next();
		System.out.println("������ѧ���Ա�:");
		sex = sca.next();
		do {
			System.out.println("������ѧ������(ֻ��1-120֮���ڵ�����):");
			age = sca.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("��������,����������");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("������ѧ�������꼶(ֻ�ܳ������м����߼�):");
			
			cls = sca.next();
			
			System.out.println(cls);
			if (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�"))) {
				System.out.println("��������,����������");
			}
		} while (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�")));
		System.out.println("������ѧ����ַ:");
		address = sca.next();
		do {
			System.out.println("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
			nums = sca.next();
		} while (nums.length() <num.length||nums.length() >num.length);
		System.out.println("������ѧ����������(����@��.com):");
		email = sca.next();
		System.out.println("���ݱ���ɹ�,ϵͳ���Զ������ϲ�Ŀ¼~");
	}

}
