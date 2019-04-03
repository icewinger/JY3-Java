import java.util.*;
public class Practice03
{
	public static void main(String[] arge)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数值");
		int num = scanner.nextInt();
		int y = f(num);
		int z = fa(num);
		System.out.println("余数是"+y);
		System.out.print(z);
	}
	public static int f(int x)
	{
		int y = x%3;
		return y;
	}
	public static int fa(int x)
	{
		int y = x++;
		return y;
	}
}