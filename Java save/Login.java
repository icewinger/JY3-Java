import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		char user = 'a';
		char password = 'c';
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û���:");
		String inputUser = scanner.next();
		System.out.print("����������:");
		String inputPsw = scanner.next();
		char c1 = inputUser.charAt(0);
		char c2 = inputPsw.charAt(0);
		if(c1==user&&c2==password)
		{
			System.out.print("��½success...");
		}
		else
		{
			System.out.print("����������");
		}

	}
}