import java.util.*;
public class ScannerDemo
{
	public static void main(String[] args)
	{
		//���ܼ�������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int num = scanner.nextInt();
		System.out.print("���������ֵ��ƽ����"+num*num);
	}
}