package com.neuedu.IODemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		File file = new File("E:\\java save\\java.txt");
		//true ��׷�� Ĭ����false
		try(FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter bf= new BufferedWriter(fileWriter);){
			bf.newLine();
			bf.write("����");
//			bf.append('6');
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
