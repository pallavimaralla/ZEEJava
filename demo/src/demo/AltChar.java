package demo;

public class AltChar {
	public static void main(String[] args) {
		String str = "ZeeTech";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(i%2 == 0)
				System.out.println(ch[i]);
	}
}
}