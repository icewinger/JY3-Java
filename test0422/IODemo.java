package com.neuedu.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
		//  ‰»Î¡˜
		InputStream is = null;
		File file = new File("E:\\java save\\neuedu.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				is = new FileInputStream(file);
				int len = 0;
				byte[] buffer = new byte[1024];
				String str = null;
				while ((len = is.read(buffer)) != -1) {
					str = new String(buffer, 0, len);
					// System.out.println(str);
				}
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (null != is) {
					try {
						is.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

	}

}
