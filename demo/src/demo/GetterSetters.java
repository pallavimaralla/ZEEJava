package demo;

class Z {
	private int  id;
//	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//private int salary;
}

public class GetterSetters{
	public static void main(String[] args) {
		Z a = new Z();
		a.setId(101);
		System.out.println(a.getId());
		a.setName("Pal");
		System.out.println(a.getName());
//		a.(101);
//		System.out.println(a.getId());
	}
}