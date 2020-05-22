package com.userapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.userapplication.bean1.UserBean;

public class UserDAO {
	UserBean userBean;

	public int insertUser(UserBean ub) {
		int status = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishakha", "root", "root");
			PreparedStatement ps = conn.prepareStatement(
					"insert into user(firstname,lastname,contact,email,address,username,password,confirmpassword) values(?,?,?,?,?,?,?,?)");

			ps.setString(1, ub.getFirstName());
			ps.setString(2, ub.getLastName());
			ps.setString(3, ub.getContact());
			ps.setString(4,ub.getEmail()); 
			ps.setString(5,ub.getAddress());
			ps.setString(6,ub.getUserName()); 
			ps.setString(7,ub.getpassword());
			ps.setString(8,ub.getConfirmPassword());


			status = ps.executeUpdate();
			conn.close();

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;

	}

	public boolean check(String userName, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishakha", "root", "root");
			PreparedStatement ps = conn.prepareStatement("select * from user where userName=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;

	}
}
