import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
		char user = 'a';
		char password = 'c';
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名:");
		String inputUser = scanner.next();
		System.out.print("请输入密码:");
		String inputPsw = scanner.next();
		char c1 = inputUser.charAt(0);
		char c2 = inputPsw.charAt(0);
		if(c1==user&&c2==password)
		{
			System.out.print("登陆success...");
		}
		else
		{
			System.out.print("请重新输入");
		}

	}
}