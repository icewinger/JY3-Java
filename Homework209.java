public class Homework209 
{
	public static void main(String[] args) 
	{
		double sun=100;
		double sum=100;
		for (int i=0;i<10 ;i++ )
		{
			sun=sun/2;
			sum+=sun;
		}
		System.out.println("共经过的距离为："+sum);
		System.out.print("第十次弹起的高度为："+sun);
	}
}
