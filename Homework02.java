import java.util.*;
public class Homework02 
{
	public static void main(String[] args) 
	{
		for (int i=100;i<10000 ;i++ )
		{
			
			int a = i/100%10;
			int b = i/10%10;
			int c = i%10;
			int d =(int) (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
			if (i==d)
			{
				System.out.println(i);
			}
		}
	}
}
