package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.*;
import java.io;

public class LearnException {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		try {
			File f = new File("abc.txt");	
FileReader fr = new FileReader(f);			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("This is a FileNotFound exception!! " +e);
		}
	}
}
