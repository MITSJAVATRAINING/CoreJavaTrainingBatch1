package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleProblem {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?)");  
			stmt.setInt(1,2);
			stmt.setString(2,"Ramesh");
			stmt.setInt(3,29);
			  stmt.executeUpdate();
//			ResultSet rs = stmt.executeQuery("select * from emp");
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
