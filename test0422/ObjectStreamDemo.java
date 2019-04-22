package com.neuedu.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectStreamDemo {
	public static void main(String[] args) {
//		Account account = new Account("马云","852741");
//		File file = new File("E:\\java save\\Account.txt");
//		try(FileOutputStream fileOutputStream = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);){
//			oos.writeObject(account);
//			System.out.println("写入成功");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//读取序列化文件的内容
		File file = new File("E:\\java save\\Account.txt");
		try(ObjectInputStream oss = new ObjectInputStream(new FileInputStream(file));) {
			Object readObject = oss.readObject();
			if (readObject instanceof Account) {
				Account ac = (Account)readObject;
				System.out.println(ac);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Account implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String userName, String psw) {
		super();
		this.userName = userName;
		this.psw = psw;
	}
	
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", psw=" + psw + "]";
	}

	private String userName;
	
	//transient 
	private transient String psw;
}