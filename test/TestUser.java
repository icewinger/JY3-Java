package com.neuedu.test;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		Test test=new Test();
		Scanner sca = new Scanner(System.in);
		System.out.print("�������¼��");
		String username =sca.next();
		System.out.print("����������");
		String password =sca.next();
		boolean checkUser = test.checkUser(username, password);
		System.out.println(checkUser==true?"��½�ɹ�":"��¼ʧ��");
		sca.close();
		
	}
}
