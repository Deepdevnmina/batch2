package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamAPI4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		Stream<String> streams=list.stream();
		//Stream<Integer>
		Stream<String> intstream=streams.map((String t) ->t.toUpperCase());
		intstream.forEach(System.out::println);
	}
}
