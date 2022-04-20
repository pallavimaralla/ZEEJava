package demo;

public class LocC {
	public static void main(String[] args) {
		String str = "ZeeTech";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'c')
				System.out.println(i);
		}

	}

}
