import java.util.*;
public class Practice07
{
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.print("请输入X1的值");
		double x1 = scr.nextDouble();
		System.out.print("请输入Y1的值");
		double y1 = scr.nextDouble();
		System.out.print("请输入X2的值");
		double x2 = scr.nextDouble();
		System.out.print("请输入Y2的值");
		double y2 = scr.nextDouble();
		double s = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("距离为"+s);
	}
}