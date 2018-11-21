package lap03.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckLogin {
	
	private static final String URL = "jdbc:mysql://localhost:3306/lab3_db";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "1111";
	private static final String SELECT_ALL = "SELECT * FROM account WHERE username=? AND password=?";

	public static boolean checkLogin(String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				if (resultSet.getString(1) != null) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static void main(String[] args) {
		boolean kq = CheckLogin.checkLogin("admin", "admin");
		System.out.println(kq);
	}
}
