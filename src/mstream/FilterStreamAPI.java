package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamAPI {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		Stream<String> streams=list.stream(); 
		streams=streams.filter((String t)->t.length()>5);
		//consuming stream
		streams.forEach(System.out::println);
		
	}
}
