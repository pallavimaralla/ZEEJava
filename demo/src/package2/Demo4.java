package package2;
import package1.*;

class D extends Demo3{
	void disp() {
		
		Demo3 d = new Demo3();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		//System.out.println(d.d);
	}

}

class E extends Demo3{
	void disp() {
		
//		Demo3 d = new Demo3();
		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}

}

class F{
	
}

public class Demo4 {
	public static void main(String[] args) {
		D d = new D();
		d.disp();
	}

}
