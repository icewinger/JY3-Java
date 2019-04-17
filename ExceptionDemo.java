package com.neuedu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
	public static void main(String[] args) {
		//System.out.println(test(null)+","+test("0")+","+test(""));
		try {
			hello();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//ÉùÃ÷Òì³£
	public static void hello() throws FileNotFoundException
	{
		FileReader fr = new FileReader("E://java save//hello1.txt");
	}
	public static int test(String str)
	{
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			e.printStackTrace();
			return 1;
		}catch (RuntimeException e) {
			e.printStackTrace();
			return 2;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 3;
		} finally {
			return 4;
		}
		
	}
}
