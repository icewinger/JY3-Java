
public class HelloWorld1
{
	public static void main(String[] args)
	{
		int age1=22;
		int age2=23;
		System.out.print(age1+age2);
		int i=19;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
		long l=12345678901l;
		float f=3.1415926f;
		double d=1234567890.0987654321;
		char c=0;
		char ch=97;
		System.out.println(c);
		System.out.println(ch);
		
		
		
		int origin1=65;
           int end1 =90;
           int origin2=97;
           int end2=122;
           int irand1 = (int)(Math.random()*( end1 - origin1 ));
           int irand2 = (int)(Math.random()*( end2 - origin2 ));
           irand1 += origin1;
           irand2 += origin2;
           int suiji=(int)(Math.random()*3);
           if(suiji<=1){
             System.out.println("��������ĸ��"+(char)irand1);
           }else{
             System.out.println("��������ĸ��"+(char)irand2);
			 
			 }
			
	}

}