package databaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFirstDatabaseProgram {

	public static void main(String args[]) { 
			try { 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root"); 
//				Statement stmt = con.createStatement();
				PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
				pstmt.setInt(1, 3);
				pstmt.setString(2, "Sharan");
				pstmt.setInt(3, 27);
				int rs = pstmt.executeUpdate();
				System.out.println(rs);
				

//				ResultSet rs = stmt.executeQuery("select * from emp");
//				while (rs.next()) {
//					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
//				}
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
