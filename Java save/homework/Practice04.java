import java.util.*;
	
public class Practice04
{
	public static void main(String[] arge)
	{
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int size = 10;
		int page =total%size==0||total%size!=0?total/size:total/size+1;
		System.out.print(page);
	}
}