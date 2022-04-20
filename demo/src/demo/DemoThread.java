package demo;
import java.util.*;
import java.awt.FocusTraversalPolicy;
import java.io.*;
import java.sql.*;

class ThreadA extends Thread{
	public void run() {
		try {
			for(int i=0; i<=10; i++) {
				System.out.println("I: " +i);
				Thread.sleep(2000);  
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		try {
				for(int j=0; j<=10; j++){
					System.out.println("    J: " +j);
					Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class DemoThread {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		b.start();
		a.start();
	}
}
