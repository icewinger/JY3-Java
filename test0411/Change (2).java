package com.neuedu.Student;

import java.util.Scanner;

public class Change {
	public Change()
	{
		int i =1;
		do {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ                    2.����ID�޸�ѧ��������Ϣ                    3.�����ϼ�Ŀ¼                    4.ϵͳ�˳�");
		System.out.println("----------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��:");
		int id = scanner.nextInt();
		if (id==1) {
			i=2;
			break;
		}
		if (id==4) {
			System.exit(0);
		}
		System.out.println("������Ҫѡ���id:");
		int id1 = scanner.nextInt();
		System.out.println("������Ҫ�޸ĵ�����:");
		String age = scanner.next();
		System.out.println("�������޸ĺ������:");
		int age2 = scanner.nextInt();
		System.out.println("�޸ĳɹ�");
		System.out.println("ϵͳ�Զ������ϲ�Ŀ¼.......");
		}while(i==1);
		if(i==2) {
		do {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+  1.�鿴����ѧ����Ϣ          2.����id��ѯѧ����Ϣ          3.����id��ѯѧ������          4.������һ��          +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Scanner sca = new Scanner(System.in);
		System.out.println("��ѡ��˵�:");
		int a = sca.nextInt();
		System.out.println("������Ҫ��ѯ��id:");
		int id = sca.nextInt();
		if(id==3) {
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("|ѧ��          |����          |����          |�Ա�          |�꼶          |�绰                                        |EMAIL                     |��ַ                                             ");
		System.out.println("|3     |����          |100   |��              |�м�          |123456789122    |zhangsan@qq.com           |�����в�ƽ������㳡             ");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼.......");
		}
		}while(i==2);
		}
}
}