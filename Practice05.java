import java.util.*;
public class Practice05
{
	public static void main(String[] arge)
	{
		Scanner sca = new Scanner(System.in);
			int a = sca.nextInt();
			if(a>100||a<0)
			{
				System.out.print("super man");
			}
			else if(a>=90&&a<=100)
			{
				System.out.print("����");
			}
			else if(a>=80&&a<=90)
			{
				System.out.print("����");
			}
			else if (a<80)
			{
				System.out.print("������");
			}
	}
}