package demo;

//import java.util.HashMap;
//import java.util.Iterator;
import java.util.*;
//import java.util.LinkedHashMap;

public class MapBAsic {
	public static void main(String[] args) {
		
//		Map m = new Map();
//		HashMap m = new HashMap();
TreeMap m = new TreeMap();
		
		m.put(100, "Ann");
		m.put(200, "Bob");
		m.put(300, "Carol");
		
		m.put(500, "George");
		m.put(500, "George");
		m.put(400, "Danny");
		
		Set set = m.entrySet();
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
			
		}
	}
}
