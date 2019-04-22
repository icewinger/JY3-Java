package com.neuedu.IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("E:\\java save\\neuedu.txt");
		OutputStream os = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			try {
				os = new FileOutputStream(file);
				String str = "今天是周一";
				os.write(str.getBytes());
				System.out.println("写出成功");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (null!=os) {
					try {
						os.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
	}
}
