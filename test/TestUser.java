package com.neuedu.test;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		Test test=new Test();
		Scanner sca = new Scanner(System.in);
		System.out.print("ÇëÊäÈëµÇÂ¼Ãû");
		String username =sca.next();
		System.out.print("ÇëÊäÈëÃÜÂë");
		String password =sca.next();
		boolean checkUser = test.checkUser(username, password);
		System.out.println(checkUser==true?"µÇÂ½³É¹¦":"µÇÂ¼Ê§°Ü");
		sca.close();
		
	}
}
