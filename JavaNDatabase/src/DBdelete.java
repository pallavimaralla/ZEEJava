import java.sql.*;
import java.util.Scanner;

public class DBdelete {
public static void main(String[] args) {
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
		
		PreparedStatement pstmt = con.prepareStatement("delete from emp where ID=?");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int ID = scanner.nextInt();
		
		
		pstmt.setInt(1, ID);
		

		pstmt.execute();
		
		System.out.println("Data Deleted");
		con.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
