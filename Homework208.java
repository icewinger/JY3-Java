public class Homework208 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=1000 ;i++ )
		{
			int sum=0;
			for (int j=0;j<=i/2 ;j++ )
			{
					sum+=j;
				if (i==sum)
				{
					System.out.println(i);
				}
			}
			
		}

	}
}
