package StringDemo;

public class WrapperDemo {
//��װ��
	public static void main(String[] args) {
		int parseInt = Integer.parseInt("45");
		System.out.println(parseInt);
		//�Զ�װ��
		//������������   ������������ Integer a = new Integer(5);

		Integer a = 5;
		//�Զ�����
		//int b = new Integer.Intvalue();
		int b = new Integer(10);
		
		
		//����ɼ�
		Integer score = null;
		
		
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.err.println(i1==i2);
		i1 = 128;
		i2 = 128;
		System.err.println(i1==i2);
	}
}
