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
		System.out.println("�������ľ���Ϊ��"+sum);
		System.out.print("��ʮ�ε���ĸ߶�Ϊ��"+sun);
	}
}