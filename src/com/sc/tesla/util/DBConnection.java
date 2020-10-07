package com.sc.tesla.util;

import java.sql.*;

public class DBConnection {

	private final static String URL = "jdbc:postgresql://localhost:5432/tesla";
	private final static String USERID = "postgres";
	private final static String PASSWORD = "secret123";

	public static Connection getConnection() {

		Connection con = null;

		try {
			con = DriverManager.getConnection(URL, USERID, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

}
