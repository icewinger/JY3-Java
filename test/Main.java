package com.neuedu.Student;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//	Loading loading = new Loading();
	int i=1;
	while(i==1) {
	System.out.println("***************************************************************");
	System.out.println("*1.�鿴ѧ����Ϣ          2.���ѧ����Ϣ          3.ɾ��ѧ����Ϣ          4.�޸�ѧ����Ϣ          5.�˳�          *");
	System.out.println("***************************************************************");
	Scanner sca = new Scanner(System.in);
	System.out.println("��ѡ��");
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
	{System.out.println("�����������������");
	break;
	}
	}
	
}
}
}
