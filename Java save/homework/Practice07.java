import java.util.*;
public class Practice07
{
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.print("������X1��ֵ");
		double x1 = scr.nextDouble();
		System.out.print("������Y1��ֵ");
		double y1 = scr.nextDouble();
		System.out.print("������X2��ֵ");
		double x2 = scr.nextDouble();
		System.out.print("������Y2��ֵ");
		double y2 = scr.nextDouble();
		double s = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("����Ϊ"+s);
	}
}