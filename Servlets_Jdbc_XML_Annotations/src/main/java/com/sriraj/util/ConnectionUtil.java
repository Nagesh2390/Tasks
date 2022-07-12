package com.sriraj.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	private ConnectionUtil() {
	}

	private static Connection con;

	public static Connection getConnection() {
		FileInputStream fis = null;
		Properties p = null;
		
			try {
				//if properties are at package level mention package name as well.
				InputStream is=ConnectionUtil.class.getClassLoader().getResourceAsStream("oracle.properties");
				p=new Properties();
				p.load(is);
				if(con==null) {
				Class.forName(p.getProperty("driver"));
				con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"),
						p.getProperty("password"));}
			} catch (IOException ie) {
				ie.printStackTrace();
			} catch (ClassNotFoundException ce) {
				ce.printStackTrace();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		
		return con;
	}
}