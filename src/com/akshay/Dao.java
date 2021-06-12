
package com.akshay;

import java.sql.*;

public class Dao

{
	public boolean check(String st, String str) {
		boolean b = false;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root", "12345");

			String s = "select * from akm where user=? and pass=?";
			PreparedStatement std = conn.prepareStatement(s);
			std.setString(1, st);
			std.setString(2, str);
			ResultSet rs = std.executeQuery();
			if (rs.next())
				b = true;
			else
				b = false;

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return b;

	}
}
