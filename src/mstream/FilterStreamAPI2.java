package mstream;

import java.util.ArrayList;
import java.util.List;

public class FilterStreamAPI2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		//How many intermediate operation you can use in stream ? n number
		//How many terminal operation you can use in stream ? 1 only
		list.stream().filter((String t)->t.length()>5).forEach(System.out::println); 
		
	}
}
