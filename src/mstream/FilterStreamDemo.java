package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamDemo {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		Stream<String> streams=list.stream(); //java.util.stream.ReferencePipeline$Head@7a81197d
		streams=streams.filter((String s)->s.length()>5);
		streams.forEach(System.out::println);
	}

}
