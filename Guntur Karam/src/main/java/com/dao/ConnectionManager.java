package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/rmsys";
		String username = "root";
		String password = "Ink@1234";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
