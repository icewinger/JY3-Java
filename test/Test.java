package com.neuedu.test;

public class Test {
	public Test() {
		usernames = new String[] {"hello"};
		password = new String[] {"123456"};
	}
	String[] usernames ;
	String[] password ;
	public boolean checkUser(String username,String password)
	{
		for (int i=0;i<usernames.length;i++)
		{
			if(usernames[i].equals(username)&&this.password[i].equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
