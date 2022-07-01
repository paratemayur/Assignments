package com.yash.tdd.Assignments.Q3;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {

	int user_id;
	String email;
	String password;
	public User(int user_id, String email, String password) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	public static boolean checkDataMatchOrNot(String s1, String s2) throws SQLException, ClassNotFoundException {
		boolean unfound = false;
		
		List<User> slist = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/tdd";
		String username = "root";
		String password = "1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded..");
		//Connection establsihed.
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("established connection successfully...!");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from user ");
		
		while (rs.next()) {
			slist.add(new User(1, "mayur.parate@yash.com", "mayurparate"));
			System.out.println("ID: "+ rs.getInt("id") + " "+" Email: "+ rs.getString("email")+ " "+" Password: "+rs.getString("password"));
			
		}
		
		for (User user : slist) {
			if(user.email.equals(s1) && user.password.equals(s2));
					unfound = true;
		}
		return unfound;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println(User.checkDataMatchOrNot("mayur.parate@yash.com", "mayurparate"));
	
	}
}
