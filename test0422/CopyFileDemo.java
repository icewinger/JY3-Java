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
		System.out.println("������Դ�ļ���·��");
		String srcFilePath = sca.nextLine();
		//ͨ��split�����õ��ļ�������
		String[] split = srcFilePath.split("\\.");
		//�����ļ�
		File srcFile = new File(srcFilePath);
		File destFile = new File(split[0]+"_����."+split[1]);
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
			System.out.println("���Ƴɹ�");
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
