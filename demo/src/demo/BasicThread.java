package demo;

class DupThread extends Thread{
	public void run() {
		for (int i = 0; i <= 50; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+": " +i);
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class BasicThread {
	public static void main(String[] args) {
		DupA a = new DupA();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		
		t1.start();
		t2.start();
		
		t1.setName("Ram");
		t2.setName("Sita");
		
		for(int k=0;k<=50;k++) {
			try {
				if(k==5)
					t1.suspend();
				if(k==10)
					t1.resume();
				if(k==14)
					System.out.println(t1.isAlive());
				if(k==20)
					t1.stop();
				if(k==25)
					System.out.println(t1.isAlive());
				
				System.out.println("                       k : "+k);
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
