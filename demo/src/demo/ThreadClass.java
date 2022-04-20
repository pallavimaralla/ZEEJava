package demo;

public class ThreadClass implements Runnable {
	public void run() {
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		ThreadClass t=new ThreadClass();
		Thread tt=new Thread(t);
		tt.start();

	}
	

}
