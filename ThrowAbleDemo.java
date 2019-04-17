package com.neuedu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class ThrowAbleDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E://java save//hello1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
