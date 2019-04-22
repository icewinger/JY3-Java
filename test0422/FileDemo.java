package com.neuedu.fileAction;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\java save\\hello.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
//		boolean delete = file.delete();
//		System.out.println(delete);
		
		//exists
		boolean exists = file.exists();
		System.out.println(exists);
		//¾ø¶ÔÂ·¾¶
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		File absoluteFile = file.getAbsoluteFile();
		System.out.println(absoluteFile);
		
		//getName
		String name = file.getName();
		System.out.println(name);
		
		//isAbsolute
		boolean absolute = file.isAbsolute();
		System.out.println(absolute);
		
		//isDirectory
		boolean directory = file.isDirectory();
		System.out.println(directory);
		
		//isHidden
		boolean hidden = file.isHidden();
		System.out.println(hidden);
		
		//length
		long length = file.length();
		System.out.println(length);
		
		
		//list
//		String[] list = file.list();
//		for (String string : list) {
//				System.out.println(string);
//		}
		//listFiles()
//		System.out.println("===========================");
//		File[] listFiles = file.listFiles();
//		for (File file2 : listFiles) {
//			System.out.println(file2.isDirectory());
//		}
		//makeDir
		System.out.println("****************************");
		File file2 = new File("E:\\java save\\neuedu\\123");
		if (!file2.exists()) {
			boolean mkdir = file2.mkdirs();
			System.out.println(mkdir);
		}
		
		//renameTo();
		File file3 = new File("E:\\java save\\neuedu\\123\\word.text");
		boolean renameTo = file.renameTo(file3);
		System.out.println(renameTo);
	}
}
