package demo;
import java.util.*;
import java.io.*;
import java.sql.*; 

class Wrongs{
	void abc() throws FileNotFoundException, SQLException {
		for(int i=0; i<=20; i++) {
			if(i==15) throw new NullPointerException();
			if(i==7) throw new ArrayIndexOutOfBoundsException();
			if(i==10) throw new NumberFormatException();
			//if(i==12) throw new SQLException();
			if(i==8) throw new FileNotFoundException();
			if(i==12) throw new SQLException();
			
			System.out.println("I : " +i);
		}
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			Wrongs wrng = new Wrongs();
			wrng.abc();
			}
		
		catch (NullPointerException np) {
			// TODO: handle exception
			System.out.println("Null pointer exception");
		}
		catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("Number Format exception");
		}
		catch (ArrayIndexOutOfBoundsException ap) {
			// TODO: handle exception
			System.out.println("Array index out of bounds");
		}
		catch (FileNotFoundException fn) {
			// TODO: handle exception
			System.out.println("Final not found  exception");
		}
		catch (SQLException sqle) {
			// TODO: handle exception
			System.out.println("SQL exception");
		}
//		catch (Exception ae) {
//			// TODO: handle exception
//			System.out.println(ae);
//		}
		finally {
			System.out.println("Thank You!!");
		}
	}
}
