import java.util.*;
public class Practice02
{
	public static void main(String[] arge)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数值");
		int num = scanner.nextInt();
		int y = f(num);
		System.out.print("结果为"+y);
	}
	public static int f(int num)
	{
		int y = num*num-2*num+4;
		return y;
	}

}