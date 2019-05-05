package com.neuedu.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
    * ������
 * @author Administrator
 */

public class DBUtils {
	//�����ļ�����
	private static Properties prop;
	
	static {
		prop = new Properties();
		try {
			prop.load(DBUtils.class.getResourceAsStream("/mysql.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�õ������ļ���url
	private static String URL = prop.getProperty("url");
	//�õ������ļ����û���
	private static String USERNAME = prop.getProperty("username");
	//�õ������ļ�������
	private static String PASSWORD = prop.getProperty("password");
	//��ȡ����
	public static Connection getConnection()
	{
		Connection conn = null;
		try{
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	
	}	
 }
