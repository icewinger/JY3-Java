package com.neuedu.Student;

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
	int j=1;
	
	public AddMissage() {
		int b = 1;
		String[] num = new String[11];
		Scanner sca = new Scanner(System.in);
		System.out.println("******************************���ѧ����Ϣ*********************************");
		System.out.println("������ѧ��id");
		do {
			a = sca.nextInt();
			if (a == 3) {
				System.out.println("��id3����,����������:");
			}
		} while (a == 3);
		System.out.println("������ѧ������:");
		name = sca.next();
		do {
		System.out.println("������ѧ���Ա�:");
		sex = sca.next();
		if (sex.equals("��")||sex.equals("Ů")) {
			j=2;
		}
		System.out.println("��������,����������");
		}while(j==1);
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
			if (nums.length() <num.length||nums.length() >num.length) {
				System.out.println("��������,����������");
			}
		} while (nums.length() <num.length||nums.length() >num.length);
		do {
		System.out.println("������ѧ����������(����@��.com):");
		email = sca.next();
		String check = ".com";
		char a = '@';
		
		for(int i=0;i<email.length();i++ )
		{
			if(a==email.charAt(i))
			{
				if(check.equals(email.substring(email.length()-4)))
				{
					System.out.println(email);
					j=3;
				}
			}
		}
		System.out.println("��������,����������");
		}while(j==2);
		System.out.println("���ݱ���ɹ�,ϵͳ���Զ������ϲ�Ŀ¼~");
	}

}
