public class Homework211 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<10 ;i++ )
		{
			for (int j=0;j<10-i ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=0;k<=i*2 ;k++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
