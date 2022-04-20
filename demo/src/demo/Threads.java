package demo;

class DupA extends Thread{
	public synchronized void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+ ": "+i);
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Threads {
	public static void main(String[] args) {
		DupA a = new DupA();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		t1.setName("Rama");
		t2.setName("Seetha");
		}
}
