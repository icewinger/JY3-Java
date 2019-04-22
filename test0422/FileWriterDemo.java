package com.neuedu.IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file = new File("E:\\java save\\neuedu.txt");
		try(FileWriter  writer = new FileWriter(file);)
		{
			writer.write("ÖÐ¹ú");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
