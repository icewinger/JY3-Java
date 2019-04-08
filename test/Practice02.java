package com.neuedu.test;

import java.util.Scanner;

public class Practice02 
{
	double x;
	double y;
	double r;
	double S;
	public  void calculation()
	{
		S=3.14*r*r;
		System.out.print("圆的面积为"+S);
	}	
	public void compare(double x1,double y1)
	{
		if(Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2))<=4)
		{
			System.out.print("点在圆内");
		}
		else
		{
			System.out.print("点在圆外");
		}
	}
	public Practice02()
	{
		
		x=3;
		y=3;
		r=4;
	}
	public static void main(String[] args)
	{
		Scanner sca =new Scanner(System.in);
		System.out.print("请输入x值");
		double x1 = sca.nextDouble();
		System.out.print("请输入y值");
		double y1 = sca.nextDouble();
		Practice02 pra=new Practice02();
		pra.calculation();
		pra.compare(x1,y1);
	}
}
