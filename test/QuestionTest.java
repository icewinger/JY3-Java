package com.neuedu.Test01;

public class QuestionTest {
	String text;
	int num;
	String[] asw;
	public boolean check(String[] answer)
	{
		return false;
	}
	public void print() 
	{
		System.out.println("题号"+num+","+text);
		//增强for循环
		for (String ans :asw)
		{
			System.out.println(" "+ans);
		}
		System.out.println();
	}
	
	
}
