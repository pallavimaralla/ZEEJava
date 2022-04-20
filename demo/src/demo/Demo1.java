package demo;

class A{
	public int a=10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class B extends A{
	void disp() {
		
		System.out.println("B class");
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}

class C{
	void disp() {
		A a1 = new A();
		System.out.println("C class");
		System.out.println(a1.a);
	//	System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
	
}
public class Demo1 {
//	public static void main(String[] args) {
//		
//	}
	public int a=10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
