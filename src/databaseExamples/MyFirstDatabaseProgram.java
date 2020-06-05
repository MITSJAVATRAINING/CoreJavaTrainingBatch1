package databaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MyFirstDatabaseProgram {

	public static void main(String args[]) { 
		Connection con = null;
			try { 
				Class.forName("com.mysql.jdbc.Driver"); 
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root"); 
//				Statement stmt = con.createStatement();
				
				ArrayList<Employee> employeeList = new ArrayList<>();
				
				Employee emp = new Employee(6,23,"TestUser5");
				employeeList.add(emp);
				emp = new Employee(7,24,"TestUser6");
				employeeList.add(emp);
				emp = new Employee(8,25,"TestUser7");
				employeeList.add(emp);
				
				PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
				con.setAutoCommit(false);
				for (Employee employee : employeeList) {
					pstmt.setInt(1, employee.getId());
					pstmt.setString(2, employee.getName());
					pstmt.setInt(3, employee.getAge());
					pstmt.addBatch();
				}
				
//				insert into emp values(6,"TestUser6",23);
//				insert into emp values(7,"TestUser7",24);
//				insert into emp values(8,"TestUser8",25);
				

//				pstmt.setInt(1, 5);
//				pstmt.setString(2, "TestUser4");
//				pstmt.setInt(3, 22);
//				pstmt.addBatch();
				
				int[] rs = pstmt.executeBatch();
				System.out.println(rs);
				con.commit();
//				ResultSet rs = stmt.executeQuery("select * from emp");
//				while (rs.next()) {
//					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
//				}
				
			}
			catch(Exception e) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
