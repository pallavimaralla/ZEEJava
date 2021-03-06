
import java.sql.*;
import java.util.Scanner;

public class DBinsert {
public static void main(String[] args) {
	try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe ","system","tiger");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
//		Statement stmtStatement = con.createStatement();
//		stmtStatement.execute("insert into emp values(3, 'Carol', 30000, 25,'Tester','SFR489')");
		
		PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int ID = scanner.nextInt();
		
		System.out.println("Enter Name: ");
		String Name = scanner.next();
		
		System.out.println("Enter Age: ");
		int Age = scanner.nextInt();
		
		System.out.println("Enter Salary: ");
		int Salary = scanner.nextInt();
		
		System.out.println("Enter Design: ");
		String Design = scanner.next();
		
		System.out.println("Enter PanCard Number: ");
		String PanCard = scanner.next();
		
		pstmt.setInt(1, ID);
		pstmt.setString(2, Name);
		pstmt.setInt(3, Salary);
		pstmt.setInt(4, Age);
		pstmt.setString(5, Design);
		pstmt.setString(6, PanCard);

		pstmt.execute();
		
		System.out.println("Data inserted");
		con.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
