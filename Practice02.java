import java.util.*;
public class Practice02
{
	public static void main(String[] arge)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ֵ");
		int num = scanner.nextInt();
		int y = f(num);
		System.out.print("���Ϊ"+y);
	}
	public static int f(int num)
	{
		int y = num*num-2*num+4;
		return y;
	}

}