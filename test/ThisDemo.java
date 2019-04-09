package com.neuedu.test;

public class ThisDemo {
	public static void main(String[] aegs)
	{
		Money money = new Money(100,"China");
		System.out.println(money.value);
		System.out.print(money.country);
		
	}
}
class Money
{
	//无参构造器
	public Money()
	{

	}
	//有参构造器
	public Money(int x,String y)
	{
		this.value = x;
		this.country = y;
	}
	
	int value;
	String country;
	
}