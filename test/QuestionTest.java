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
		System.out.println("���"+num+","+text);
		//��ǿforѭ��
		for (String ans :asw)
		{
			System.out.println(" "+ans);
		}
		System.out.println();
	}
	
	
}
