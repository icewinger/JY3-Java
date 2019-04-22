package com.neuedu.IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReadDemo {
	public static void main(String[] args) {
		File file = new File("E:\\java save\\java.txt");
		try(Reader r = new FileReader(file);) {
			char[] c = new char[1024];
			int read = r.read(c);
			String string = new String(c,0,read);
			System.out.println(string);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
