package com.sriraj.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {

	private ConnectionUtility() {
	}

	private static Connection con;

	public static Connection getConnection() {
		if (con == null) {
			try {
				File file=new File("resources/oracle.properties");//Read Sql file for SQL properties
				FileReader reader = new FileReader(file);
				Properties p = new Properties();
				p.load(reader);

				Class.forName(p.getProperty("driver"));
				con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"),
						p.getProperty("password"));

			} catch (IOException ie) {
				ie.printStackTrace();
			} catch (ClassNotFoundException ce) {
				ce.printStackTrace();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return con;
	}
}