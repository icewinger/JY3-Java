public class Tast04
{
	public static void main(String[] args) 
	{
		for(int i=32;i<100;++i)
		{
			int a= i*i;
			if(a%10==a/10%10&&a/100%10==a/1000%10)
			{
				System.out.print("���ƺ���"+a);

			}
		
		}
	}
}
