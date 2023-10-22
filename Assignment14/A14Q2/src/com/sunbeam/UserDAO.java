package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO implements AutoCloseable {
	private Connection con;

	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete given user
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	private String fName;
	private String lName;
	private String email;
	private String password;
	private String dob;
	private boolean status;
	private String role;

	// display all users
	public List<User> findAll() throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String fName = rs.getString("first_name");
					String lName = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sDate = rs.getDate("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(0,fName, lName, email, password, sDate, status, role);
					list.add(u);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// add new user
	public int adduser(User u) throws SQLException {
		String sql = "insert into users values(default,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPasswd());
			stmt.setDate(5, u.getDob());
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	// update user
		public int update(User u) throws SQLException {
			String sql="update users set status=0, role=? where id=?";
			try(PreparedStatement stmt=con.prepareStatement(sql)){
				stmt.setString(1, u.getRole());
				stmt.setInt(2, u.getId());
				int cnt = stmt.executeUpdate();
				return cnt;
			}
		}
}