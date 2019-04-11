package com.neuedu.change;

public class Change {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		a = a^b;
		b = b^a;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
				
	}

}
