package chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	/*	ArrayList<String> list1 = new ArrayList<>(); //초급자
		List<String> List2 = new ArrayList<>(); // 중급자
		list2 = new LinkedList<>();	
		list2 = new Vectro<>();
	*/
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		
		for(String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		list.add(2, "Database");
		list.add("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		}
		/*for (String string : list) {
			System.out.println(string);
		}
		*/
		System.out.println();
		// get
		String skill = list.get(4);
		System.out.println(skill);
		
		//remove
		list.remove("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " +list.get(i));
		}
		
		System.out.println();
		
		list.clear();
		System.out.println(list.size());
	}
	

}
