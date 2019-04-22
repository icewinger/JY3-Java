package com.neuedu.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFileDemo {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入源文件的路径");
		String srcFilePath = sca.nextLine();
		//通过split方法拿到文件的类型
		String[] split = srcFilePath.split("\\.");
		//读入文件
		File srcFile = new File(srcFilePath);
		File destFile = new File(split[0]+"_副本."+split[1]);
		InputStream is = null;
		OutputStream os = null; 
		try {
			is = new FileInputStream(srcFile);
			os = new FileOutputStream(destFile);
			int len = 0;
			byte[] buffer = new byte[1024];
			
			while((len=is.read(buffer))!=-1) {
				os.write(buffer,0,len);
			}
			System.out.println("复制成功");
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
			if (null!=is) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sca.close();
		}
	}
}
