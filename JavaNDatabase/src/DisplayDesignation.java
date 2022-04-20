import java.sql.*;
import java.util.Scanner;

public class DisplayDesignation {
public static void main(String[] args) throws SQLException {
	Connection con = null;
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
		
		
	

		PreparedStatement pstmt = con.prepareStatement("Select * from emp where Design=?");
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		for (int i = 1; i <=count; i++) 
		{
			System.out.print(rsmd.getColumnLabel(i)+" \t ");
			
		}
		System.out.println();
		
		while (rs.next()) {
			
			
			System.out.println(rs.getInt("ID")+ " \t " +rs.getString(2)+" \t " +rs.getInt(3)+" \t " +rs.getInt(4)+" \t " +rs.getString(5)+" \t " +rs.getString(6) );
		}
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter Designation: ");
		String Design = scanner.next();
//		
//		
		pstmt.setString(1, Design);
//		
//
		pstmt.execute();
//		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	finally {
		con.close();
		System.out.println("Data Displayed");

	}
}
}
