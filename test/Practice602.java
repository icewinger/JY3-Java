package com.neuedu.homework;

import java.util.Scanner;

public class Practice602{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入长");
		int l = sca.nextInt();
		System.out.println("请输入宽");
		int w = sca.nextInt();
		rec.showAll(l, w);
		sca.close();
	}
}

class Rectangle {
	public Rectangle()
	{
		length = 5;
		width = 5;
	}
	int length;
	int width;
	public int getArea(int a,int b)
	{
		int S = a*b;
		return S;
	}
	public int getPer(int a,int b)
	{
		int L =(a+b)*2;
		return L;
	}
	public void showAll(int a,int b)
	{	
		int x =this.getArea(a, b);
		int y=this.getPer(a, b);
		System.out.println("长度为"+a);
		System.out.println("宽度为"+b);
		System.out.println("面积为"+x);
		System.out.println("周长为"+y);
		
	}
}
