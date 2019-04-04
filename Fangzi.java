public class Fangzi
 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<4-i ;j++ )
			{
				System.out.print(" ");
			}	
			System.out.print("*****");
			for (int k=0;k<i*2 ;k++ )
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=0;i<14;i++)
		{
			System.out.print("*");
		}
			System.out.println();
		for(int j=0;j<3;j++)
			{
				System.out.print("*");
				for(int k=0;k<12;k++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for(int i=0;i<14;i++)
		{
			System.out.print("*");
		}
	}
}
