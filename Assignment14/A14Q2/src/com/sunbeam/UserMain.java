package com.sunbeam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// delete user
		try (UserDAO dao = new UserDAO()) {
			System.out.print("Enter user id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Users deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		//display all users
		try (UserDAO dao = new UserDAO()) {
			List<User> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		// add new user
		try (UserDAO dao = new UserDAO()) {
			System.out.print("Enter First Name: ");
			String fName = sc.next();
			System.out.print("Enter Last Name: ");
			String lName = sc.next();
			System.out.println("Enter Email ID: ");
			String email = sc.next();
			System.out.println("Enter Password");
			String password = sc.next();
			System.out.print("Birth Date of Birth (dd-MM-yyyy): ");
			String bdate = sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(bdate);
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			System.out.println("Enter status: ");
			Boolean status = sc.nextBoolean();
			System.out.println("Enter the Role");
			String role = sc.next();
			// can do it with accept method also
			// write accept() in user class and create new obj c & call accept method
			// c.accept()
			// but this is not a good practice in POJO class
			User u = new User(0, fName, lName, email, password, sDate, status, role);
			int cnt = dao.adduser(u);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		// update user
		try (UserDAO dao = new UserDAO()) {
			System.out.println("Enter id to update user: ");
			int id=sc.nextInt();
			System.out.println("Enter the Role");
			String role = sc.next();
			User u = new User(id, null, null, null, null, null, false, role);
			int cnt = dao.update(u);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}