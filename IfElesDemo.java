import java.util.*;
public class IfElesDemo
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
				System.out.print("������Ҫ����:");
			int	a =	scanner.nextInt();
				System.out.print("�����뵥��:");
			double	c = scanner.nextDouble();
		System.out.print(buy(a,c));
	}

			public static double buy(int count,double price)
			{
				
				if (count<1)
				{
					System.out.print("����");
					return 0.0;
					}
				else
				{
					price+=(count-1)*price/2;
					return price;
				}
			}
}