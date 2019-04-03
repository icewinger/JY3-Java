public class Demo01
{
	public static void main(String[] arge)
	{
		int x = 48;
		char y = f(x);
		char z = 'жа';
		int w = fa(z);
		System.out.println(y);javascript:void(0);
		System.out.println(w);
	}
	public static char f(int a)
	{
		char b = (char)a;
		return b;
	}
	public static int fa(char c)
	{
		int result = c;
		return result;
	}
}