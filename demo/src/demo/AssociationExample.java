package demo;

import java.util.List;

class ProgrammingLanguages{
	private String language;
	
	public void SetLanguage(String Language) {
		this.language = Language;
	}
	
	public String getLanguage() {
		return language;
	}
}


class Developer {
	private String name;
	
	List<ProgrammingLanguages> languageList;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<ProgrammingLanguages> getLanguages(){
		return languageList;
	}
	
	public void setLanguages(List<ProgrammingLanguages> language) {
		this.languageList = language;
	}
}
public class AssociationExample {
	public static void main(String[] args) {
		List<ProgrammingLanguages> dList;
		
		
		Developer d = new Developer();
		d.setName("Ann");
		
		ProgrammingLanguages pl = new ProgrammingLanguages();
		pl.SetLanguage("Python");
		
		System.out.println(pl.getLanguage());
		System.out.println(d.getName());
		
	}

}
