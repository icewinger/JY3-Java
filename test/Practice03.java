package com.neuedu.test;

public class Practice03 {
	
	public static void main(String[] args)
	{
		boolean a= Marry("1201041999112", 22, false);
		if(a==true)
		{
			System.out.print("���Խ��");
		}
		else
		{
			System.out.print("�����Խ��");
		}
			
	}
	public static boolean Marry(String x,int y,boolean z)
	{
		Preson pre =new Preson();
		Preson pre2 =new Preson();
		pre2.idNum =x;
		pre2.age =y;
		pre2.isMarry=z;
		if(pre.idNum!=x&&pre.age>=20&&y>=22&&z==false&&pre.isMarry==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Preson
{
	int nums; 
	String name;
	boolean sex;
	int age;
	boolean isMarry;
	String idNum;
	String address;
	String ipone;
	boolean Pao;
	public Preson()
	{
		nums=123;
		name="С��Ů";
		sex=false;
		age=20;
		isMarry=false;
		idNum="1201041999111";
		address="���";
		ipone="123456789101";
		Pao=false;
	}
}