import java.util.*;
public class Demo02
{
	public static void main(String[] arge)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ҫת�����ַ�:");
		String num = scanner.next();
		char specialChar = num.charAt(0);
		int result = getCharToInt(specialChar);
		System.out.print(result);
	}
	public static  int getCharToInt(char a)
	{
		return a; 
	}
}