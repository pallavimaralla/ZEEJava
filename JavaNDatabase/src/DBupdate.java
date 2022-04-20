import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class DBupdate {
public static void main(String[] args) {
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
		
		PreparedStatement pstmt = con.prepareStatement("update emp set Salary=? where ID=?");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int ID = scanner.nextInt();
		System.out.println("Enter Salary: ");
		int Salary = scanner.nextInt();
		
		
		
		pstmt.setInt(1, Salary);
		pstmt.setInt(2, ID);
		

		pstmt.execute();
		
		System.out.println("Data Updated");
		con.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
