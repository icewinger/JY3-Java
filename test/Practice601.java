package com.neuedu.homework;

import java.util.Scanner;

public class Practice601 {
	public static void main(String[] args) {
		Point point = new Point();
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入x值");
		int x = sca.nextInt();
		System.out.println("请输入y值");
		int y = sca.nextInt();
		point.movePoint(x, y);
		sca.close();
	}

}
class Point
{
	int x;
	int y;
	public Point()
	{
		x = 2;
		y = 1;
	}
	public Point(int x0,int y0)
	{
		
	}
	public void movePoint(int dx,int dy)
	{
		 x += dx;
		 y += dy;
		 System.out.println("x移动后为"+x);
		 System.out.println("y移动后为"+y);
	}
}